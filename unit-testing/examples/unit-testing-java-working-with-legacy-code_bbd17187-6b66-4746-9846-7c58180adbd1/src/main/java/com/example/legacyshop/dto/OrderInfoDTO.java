package com.example.legacyshop.dto;

import com.example.legacyshop.model.OrderStatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@Setter
public class OrderInfoDTO {

    @Setter
    UUID id;
    OrderStatus status;
    LocalDate createdAt;
    @With
    BigDecimal amount;

    List<OrderLineDTO> lines;

}
