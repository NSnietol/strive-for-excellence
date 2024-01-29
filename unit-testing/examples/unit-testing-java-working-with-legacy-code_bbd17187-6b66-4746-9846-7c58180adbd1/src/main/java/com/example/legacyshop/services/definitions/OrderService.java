package com.example.legacyshop.services.definitions;

import com.example.legacyshop.dto.OrderInfoDTO;
import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Order;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    OrderInfoDTO getOrderWithDiscount(UUID uuid, CustomerType customerType);
    Order getFullOrder(UUID uuid);
    OrderInfoDTO getOrderInfoById(UUID uuid);
    List<OrderInfoDTO> getOrdersByCustomer(UUID uuid);
    OrderInfoDTO saveDraftOrder(UUID costumerId);
     void saveOrderLine(UUID orderID, UUID productID, Integer quantity);
}
