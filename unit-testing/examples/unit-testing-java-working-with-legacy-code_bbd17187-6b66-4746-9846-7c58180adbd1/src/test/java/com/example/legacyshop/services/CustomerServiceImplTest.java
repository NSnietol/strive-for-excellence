package com.example.legacyshop.services;

import com.example.legacyshop.database.DBManager;
import com.example.legacyshop.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class CustomerServiceImplTest {
    private CustomerServiceImpl customerService;

    @Mock
    private DBManager dbManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        customerService = new CustomerServiceImpl(dbManager);
    }

    @Test
    void getCustomerById_existingCustomerId_returnsCustomer() {
        UUID customerId = UUID.randomUUID();
        Customer customer = new Customer(customerId,"John Doe");
        when(dbManager.getCustomers()).thenReturn(List.of(customer));

        Customer resultCustomer = customerService.getCustomerById(customerId);

        assertEquals(customer, resultCustomer);
    }

    @Test
    void getCustomerById_nonExistingCustomerId_throwsException() {
        UUID customerId = UUID.randomUUID();
        when(dbManager.getCustomers()).thenReturn(List.of());
        assertThrows(NoSuchElementException.class, () -> customerService.getCustomerById(customerId));
    }
}
