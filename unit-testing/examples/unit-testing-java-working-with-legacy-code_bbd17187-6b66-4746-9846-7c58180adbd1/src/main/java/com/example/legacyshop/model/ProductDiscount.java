package com.example.legacyshop.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class ProductDiscount {

    private UUID id;
    private UUID productId;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private BigDecimal discountPercent;
    private CustomerType customerType;
}
