package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Product;
import com.example.legacyshop.model.ProductDiscount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProductServiceImplTest {
    private ProductServiceImpl productService;

    @Mock
    private DBManager dbManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        productService = new ProductServiceImpl(dbManager);
    }

    @Test
    void getProductIdByName_existingProductName_returnsProductId() {
        String productName = "Test Product";
        UUID productId = UUID.randomUUID();
        Product product = new Product(productId, productName, BigDecimal.ZERO, Collections.emptyList());
        when(dbManager.getProducts()).thenReturn(List.of(product));

        UUID resultProductId = productService.getProductIdByName(productName);

        assertEquals(productId, resultProductId);
    }

    @Test
    void getMapOfDiscountedProducts_validData_returnsMapOfDiscountedProducts() {
        UUID productId = UUID.randomUUID();
        Product product = new Product(productId, "Test Product", BigDecimal.ZERO, Collections.emptyList());
        when(dbManager.getMapOfDiscountedProducts()).thenReturn(Collections.singletonMap(productId, product));

        Map<UUID, Product> resultProducts = productService.getMapOfDiscountedProducts();

        assertEquals(Collections.singletonMap(productId, product), resultProducts);
    }

    @Test
    void getApplicableDiscount_withApplicableDiscount_returnsDiscount() {
        UUID productId = UUID.randomUUID();
        ProductDiscount discount = ProductDiscount.builder()
                .id(UUID.randomUUID())
                .productId(productId)
                .dateFrom(LocalDate.now().minusDays(1))
                .dateTo(LocalDate.now().plusDays(1))
                .discountPercent(BigDecimal.valueOf(10))
                .customerType(CustomerType.REGULAR)
                .build();
        Product product = new Product(productId, "Test Product", BigDecimal.valueOf(100), Arrays.asList(discount));

        when(dbManager.getMapOfDiscountedProducts()).thenReturn(Collections.singletonMap(productId, product));

        BigDecimal resultDiscount = productService.getApplicableDiscount(productId, CustomerType.REGULAR);

        BigDecimal expectedDiscount = BigDecimal.valueOf(10).setScale(2, RoundingMode.HALF_UP);
        assertEquals(expectedDiscount, resultDiscount);
    }

    @Test
    void getApplicableDiscount_withoutApplicableDiscount_returnsZeroDiscount() {
        UUID productId = UUID.randomUUID();
        Product product = new Product(productId, "Test Product", BigDecimal.valueOf(100), Collections.emptyList());
        when(dbManager.getMapOfDiscountedProducts()).thenReturn(Collections.singletonMap(productId, product));

        BigDecimal resultDiscount = productService.getApplicableDiscount(productId, CustomerType.STUDENT);

        BigDecimal expectedDiscount = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expectedDiscount, resultDiscount);
    }

    @Test
    void getApplicableDiscount_withoutDiscounts_returnsZeroDiscount() {
        UUID productId = UUID.randomUUID();
        Product product = new Product(productId, "Test Product", BigDecimal.valueOf(100), Collections.emptyList());
        when(dbManager.getMapOfDiscountedProducts()).thenReturn(Collections.singletonMap(productId, product));

        BigDecimal resultDiscount = productService.getApplicableDiscount(productId, CustomerType.REGULAR);

        BigDecimal expectedDiscount = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expectedDiscount, resultDiscount);
    }
}
