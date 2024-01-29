package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.dto.OrderInfoDTO;
import com.example.legacyshop.dto.OrderInfoMapper;
import com.example.legacyshop.dto.OrderLineDTO;
import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Order;
import com.example.legacyshop.model.OrderLine;
import com.example.legacyshop.model.OrderStatus;
import com.example.legacyshop.services.definitions.OrderService;
import com.example.legacyshop.services.definitions.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

@Component
public class OrderServiceImpl implements OrderService {

    private final DBManager dbManager;
    private final ProductService productService;

    @Autowired
    public OrderServiceImpl(DBManager dbManager, ProductService productService) {
        this.dbManager = dbManager;
        this.productService = productService;
    }


    @Override
    public OrderInfoDTO getOrderInfoById(UUID uuid) {
        return new OrderInfoMapper().mapToDTO(getOrderById(uuid));
    }

    @Override
    public List<OrderInfoDTO> getOrdersByCustomer(UUID uuid) {
        return dbManager.getOrders().stream()
                .filter(order -> order.getCustomerId().equals(uuid))
                .map(order -> new OrderInfoMapper().mapToDTO(order))
                .collect(toList());
    }

    @Override
    public OrderInfoDTO saveDraftOrder(UUID customerID) {
        UUID orderID = UUID.randomUUID();
        final var order = Order.builder()
                .id(orderID)
                .amount(BigDecimal.ZERO)
                .status(OrderStatus.DRAFT)
                .customerId(customerID)
                .createdAt(LocalDate.now())
                .build();

        saveOrder(order);
        return getOrderInfoById(orderID);
    }

    @Override
    public OrderInfoDTO getOrderWithDiscount(UUID uuid, CustomerType customerType){
        Order order = getOrderById(uuid);
        var discountedProducts = productService.getMapOfDiscountedProducts();
        var lines = order.getLines()
                .stream()
                .map(line -> {

                    var product = discountedProducts.get(line.getProductID());

                    BigDecimal discount = productService.getApplicableDiscount(line.getProductID(), customerType);

                    BigDecimal amount = product.getBasePrice().subtract(discount).multiply(BigDecimal.valueOf(line.getQuantity()));


                    return new OrderLineDTO(product.getName(), line.getQuantity(), product.getBasePrice(), discount, amount);

                }).collect(toList());

        order.setAmount(getTotalAmountOfLines(lines));


        return new OrderInfoDTO(
                order.getId(),
                order.getStatus(),
                order.getCreatedAt(),
                order.getAmount(),
                lines);
    }

    private BigDecimal getTotalAmountOfLines(List<OrderLineDTO>  orderLineDTOS){
        return orderLineDTOS.stream().map(OrderLineDTO::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public void saveOrderLine(UUID orderID, UUID productID, Integer quantity) {
        dbManager.getOrderLines().add(OrderLine.builder()
                .id(UUID.randomUUID())
                .orderID(orderID)
                .productID(productID)
                .quantity(quantity)
                .build());
    }
    @Override
    public Order getFullOrder(UUID orderID) {
        var order = getOrderById(orderID);
        var orderLines = getOrderLinesByOrderId(orderID);
        order.setLines(orderLines);
        return order;
    }

    private Order getOrderById(UUID uuid) {
        return dbManager.getOrders().stream()
                .filter(order -> order.getId().equals(uuid))
                .findFirst().orElseThrow();
    }

    private void saveOrder(Order order) {
        dbManager.getOrders().add(order);
    }

    private List<OrderLine> getOrderLinesByOrderId(UUID orderID) {
        return dbManager.getOrderLines()
                .stream()
                .filter(orderLine -> orderLine.getOrderID().equals(orderID))
                .collect(toList());
    }

}
