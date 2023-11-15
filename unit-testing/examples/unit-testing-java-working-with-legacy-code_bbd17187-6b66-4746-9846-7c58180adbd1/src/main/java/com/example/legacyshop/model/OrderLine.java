package com.example.legacyshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {

    private UUID id;
    private UUID orderID;
    private UUID productID;
    private Integer quantity;
}
