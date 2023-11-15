package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Product;
import com.example.legacyshop.model.ProductDiscount;
import com.example.legacyshop.services.definitions.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ProductServiceImpl implements ProductService {
    private final DBManager dbManager;

    @Autowired
    public ProductServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
    }


    @Override
    public UUID getProductIdByName(String name) {
        return dbManager.getProducts().stream()
                .filter(prod -> prod.getName().equals(name))
                .map(Product::getId)
                .findFirst().orElseThrow();
    }

    @Override
    public Map<UUID, Product> getMapOfDiscountedProducts() {
        return dbManager.getMapOfDiscountedProducts();
    }


    @Override
    public BigDecimal getApplicableDiscount(UUID productId, CustomerType customerType) {
        Product product = getMapOfDiscountedProducts().get(productId);

        List<ProductDiscount> applicableDiscounts =
                getApplicableDiscountsForCustomerInProduct(customerType, product);

        BigDecimal discount = BigDecimal.ZERO;
        if (hasApplicableDiscount(applicableDiscounts)) {
            BigDecimal discountPercent = applicableDiscounts.stream()
                    .map(ProductDiscount::getDiscountPercent)
                    .max(Comparator.naturalOrder())
                    .orElse(BigDecimal.ZERO);
            discount = product.getBasePrice().multiply(discountPercent).divide(BigDecimal.valueOf(100));
        }

        return discount.setScale(2, RoundingMode.HALF_UP);
    }

    private boolean hasApplicableDiscount(List<ProductDiscount> applicableDiscounts) {
        return !applicableDiscounts.isEmpty();
    }

    private List<ProductDiscount> getApplicableDiscountsForCustomerInProduct(CustomerType customerType, Product product) {

       return product
               .getDiscounts().stream()
                .dropWhile(discount -> discount.getDateFrom().isAfter(LocalDate.now()) || discount.getDateTo().isBefore(LocalDate.now()))
                .dropWhile(discount -> discount.getCustomerType() != null && discount.getCustomerType() != customerType)
                .collect(Collectors.toList());

    }
}
