package com.example.legacyshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private UUID id;
    private UUID customerId;
    private OrderStatus status;
    private LocalDate createdAt;
    private BigDecimal amount;
    private List<OrderLine> lines;
}
