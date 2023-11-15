package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.model.Customer;
import com.example.legacyshop.services.definitions.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerServiceImpl implements CustomerService {

    private DBManager dbManager;

    @Autowired
    public CustomerServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
    }


    @Override
    public Customer getCustomerById(UUID customerId) {
       return dbManager.getCustomers().stream()
                .filter(customer -> customer.getId().equals(customerId))
                .findFirst().orElseThrow();
    }
}
