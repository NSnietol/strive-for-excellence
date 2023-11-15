package com.example.legacyshop.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Customer {

    private UUID id;
    private String name;

    public Customer() {
    }

    public Customer(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    private CustomerType type;


}
