package com.example.legacyshop.dto;

import com.example.legacyshop.model.Order;

import java.util.ArrayList;

public class OrderInfoMapper {
    public OrderInfoDTO mapToDTO(Order order){
       return new OrderInfoDTO(order.getId(), order.getStatus(), order.getCreatedAt(), order.getAmount(), new ArrayList<>());
    }
}
