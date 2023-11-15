package com.example.legacyshop.services.definitions;

import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Product;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public interface ProductService {

    UUID getProductIdByName(String name);

    Map<UUID, Product> getMapOfDiscountedProducts();


    BigDecimal getApplicableDiscount(UUID productId, CustomerType customerType);
}
