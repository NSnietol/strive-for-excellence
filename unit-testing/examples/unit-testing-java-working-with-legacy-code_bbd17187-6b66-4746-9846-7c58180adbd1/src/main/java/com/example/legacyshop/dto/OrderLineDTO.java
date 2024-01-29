package com.example.legacyshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
public class OrderLineDTO {

    String product;
    int quantity;
    BigDecimal price;
    BigDecimal discount;
    BigDecimal amount;
}
