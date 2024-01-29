package com.example.legacyshop.controller;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.dto.OrderInfoDTO;
import com.example.legacyshop.model.Order;
import com.example.legacyshop.services.definitions.CustomerService;
import com.example.legacyshop.services.definitions.OrderService;
import com.example.legacyshop.services.definitions.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {

    private final ProductService productService;
    private final OrderService orderService;
    private final CustomerService customerService;

    @GetMapping("/orders")
    public List<OrderInfoDTO> getOrders(@RequestParam UUID customerID) {
        return orderService.getOrdersByCustomer(customerID);
    }

    @GetMapping("/orders/{id}")
    public OrderInfoDTO getOrder(@PathVariable UUID id) {
        return orderService.getOrderInfoById(id);
    }

    @PostMapping("/orders")
    public OrderInfoDTO createDraftOrder(@RequestParam UUID customerID) {

        return orderService.saveDraftOrder(customerID);

    }

    @PostMapping("/orders/{orderID}/lines")
    public OrderInfoDTO insertOrderLine(@PathVariable UUID orderID, @RequestParam("product") String product, @RequestParam("quantity") int quantity) {

        var productId = productService.getProductIdByName(product);
        orderService.saveOrderLine(orderID, productId, quantity);
        var order = orderService.getFullOrder(orderID);
        return recalculateOrder(order);
    }


    private OrderInfoDTO recalculateOrder(Order order) {
        var customerType = customerService.getCustomerById(order.getCustomerId()).getType();
        return orderService.getOrderWithDiscount(order.getId(), customerType);
    }


}
