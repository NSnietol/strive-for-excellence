package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.dto.OrderInfoDTO;
import com.example.legacyshop.dto.OrderInfoMapper;
import com.example.legacyshop.dto.OrderLineDTO;
import com.example.legacyshop.model.*;
import com.example.legacyshop.services.definitions.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class OrderServiceImplTest {
    private OrderServiceImpl orderService;

    @Mock
    private DBManager dbManager;

    @Mock
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        orderService = new OrderServiceImpl(dbManager, productService);
    }

    @Test
    void getOrderInfoById_validId_returnsOrderInfoDTO() {
        UUID orderId = UUID.randomUUID();
        Order order = getStubOrder(orderId);

        when(dbManager.getOrders()).thenReturn(List.of(order));

        OrderInfoDTO expectedDTO = new OrderInfoMapper().mapToDTO(order);

        OrderInfoDTO resultDTO = orderService.getOrderInfoById(orderId);

        assertNotNull(resultDTO);
        assertEquals(expectedDTO, resultDTO);
    }

    @Test
    void getOrdersByCustomer_validCustomerId_returnsOrderInfoDTOList() {
        var mapper = new OrderInfoMapper();
        UUID customerId = UUID.randomUUID();

        Order order1 = getStubOrder(UUID.randomUUID());
        Order order2 = getStubOrder(UUID.randomUUID());

        order1.setCustomerId(customerId);
        order2.setCustomerId(customerId);

        when(dbManager.getOrders()).thenReturn(List.of(order1, order2));

        List<OrderInfoDTO> expectedDTOList = List.of(
                mapper.mapToDTO(order1), mapper.mapToDTO(order2));

        List<OrderInfoDTO> resultDTOList = orderService.getOrdersByCustomer(customerId);

        assertNotNull(resultDTOList);
        assertEquals(expectedDTOList.size(), resultDTOList.size());
        assertEquals(expectedDTOList.get(0), resultDTOList.get(0));
        assertEquals(expectedDTOList.get(1), resultDTOList.get(1));
    }

    @Test
    void saveDraftOrder_validCustomerId_returnsOrderInfoDTO() {
        var mapper = new OrderInfoMapper();
        UUID customerId = UUID.randomUUID();
        when(dbManager.getOrders()).thenReturn(new ArrayList<>());
        OrderInfoDTO expectedDTO = mapper.mapToDTO(getStubOrder(UUID.randomUUID()));

        OrderInfoDTO resultDTO = orderService.saveDraftOrder(customerId);

        assertNotNull(resultDTO);
        assertEquals(expectedDTO.getStatus(), resultDTO.getStatus());
        assertEquals(expectedDTO.getCreatedAt(), resultDTO.getCreatedAt());
        assertEquals(expectedDTO.getAmount(), resultDTO.getAmount());
        assertEquals(expectedDTO.getLines(), resultDTO.getLines());
    }

    @Test
    void getOrderWithDiscount_validOrderIdAndCustomerType_returnsOrderInfoDTO() {
        UUID orderId = UUID.randomUUID();
        UUID productID = UUID.randomUUID();
        Order order = getStubOrder(orderId);

        order.setLines(List.of(new OrderLine(UUID.randomUUID(), orderId, productID, 5)));

        Map<UUID, Product> discountedProducts = getStubDiscountedProducts(productID);

        when(productService.getMapOfDiscountedProducts())
                .thenReturn(discountedProducts);
        when(productService.getApplicableDiscount(any(UUID.class), any(CustomerType.class)))
                .thenReturn(BigDecimal.valueOf(2));

        when(dbManager.getOrders())
                .thenReturn(List.of(order));


        OrderInfoDTO resultDTO = orderService.getOrderWithDiscount(orderId, CustomerType.REGULAR);


        var orderLineDTO = OrderLineDTO.builder()
                .product("Test Product")
                .quantity(5)
                .price(BigDecimal.valueOf(15))
                .discount(BigDecimal.valueOf(2))
                .amount(BigDecimal.valueOf(65)).build();
        var expectedResult = OrderInfoDTO.builder()
                .id(orderId)
                .amount(BigDecimal.valueOf(65))
                .status(OrderStatus.DRAFT)
                .createdAt(LocalDate.now())
                .lines(List.of(orderLineDTO)).build();


        assertEquals(expectedResult, resultDTO);
    }

    private Map<UUID, Product> getStubDiscountedProducts(UUID productId) {
        Map<UUID, Product> discountedProducts = new HashMap<>();

        Product product = new Product();
        product.setId(productId);
        product.setName("Test Product");
        product.setBasePrice(BigDecimal.valueOf(15));
        discountedProducts.put(productId, product);
        return discountedProducts;
    }

    @Test
    void saveOrderLine_validOrderIDProductIDAndQuantity_savesOrderLine() {
        UUID orderID = UUID.randomUUID();
        UUID productID = UUID.randomUUID();
        Integer quantity = 5;
        when(dbManager.getOrderLines()).thenReturn(new ArrayList<>());

        orderService.saveOrderLine(orderID, productID, quantity);

        verify(dbManager).getOrderLines();
        assertEquals(1, dbManager.getOrderLines().size());
    }

    @Test
    void getFullOrder_validOrderID_returnsOrderWithOrderLines() {
        UUID orderID = UUID.randomUUID();
        var order = getStubOrder(orderID);

        List<OrderLine> orderLines = List.of(new OrderLine(UUID.randomUUID(), orderID, UUID.randomUUID(), 5));
        when(dbManager.getOrders()).thenReturn(List.of(order));
        when(dbManager.getOrderLines()).thenReturn(orderLines);

        Order resultOrder = orderService.getFullOrder(orderID);

        assertNotNull(resultOrder);
        assertEquals(orderID, resultOrder.getId());
        assertEquals(OrderStatus.DRAFT, resultOrder.getStatus());
        assertEquals(LocalDate.now(), resultOrder.getCreatedAt());
        assertEquals(orderLines, resultOrder.getLines());
    }

    private Order getStubOrder(UUID orderID) {
        return Order.builder().id(orderID)
                .amount(BigDecimal.ZERO)
                .status(OrderStatus.DRAFT)
                .customerId(UUID.randomUUID())
                .lines(new ArrayList<>())
                .createdAt(LocalDate.now()).build();
    }
}