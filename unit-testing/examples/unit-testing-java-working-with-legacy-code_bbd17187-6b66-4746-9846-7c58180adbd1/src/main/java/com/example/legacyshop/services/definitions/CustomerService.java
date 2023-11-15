package com.example.legacyshop.services.definitions;

import com.example.legacyshop.model.Customer;

import java.util.UUID;

public interface CustomerService {

    Customer getCustomerById(UUID customerId);
}
