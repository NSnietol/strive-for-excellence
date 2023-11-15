package com.example.legacyshop.database;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Component;

import com.example.legacyshop.model.Customer;
import com.example.legacyshop.model.CustomerType;
import com.example.legacyshop.model.Order;
import com.example.legacyshop.model.OrderLine;
import com.example.legacyshop.model.Product;
import com.example.legacyshop.model.ProductDiscount;

import lombok.Getter;

@Component
@Getter
public class DBManager {

    private final List<Order> orders;
    private final List<Customer> customers;
    private final List<Product> products;
    private final List<ProductDiscount> productDiscounts;
    private final List<OrderLine> orderLines;

    public DBManager() {
        this.orders = new ArrayList<>();
        this.customers = defaultCustomers();
        this.products = defaultProducts();
        this.productDiscounts = defaultProductDiscounts();
        this.orderLines = new ArrayList<>();
    }

    public Map<UUID, Product> getMapOfDiscountedProducts() {
        Map<UUID, Product> map = new HashMap<>();
        for (Product product : getProducts()) {
            map.put(product.getId(), product);
        }
        List<ProductDiscount> discounts = getProductDiscounts();
        for (ProductDiscount discount : discounts) {
            map.get(discount.getProductId()).getDiscounts().add(discount);
        }
        return map;
    }

    private List<Customer> defaultCustomers() {
        List<Customer> customerList = new ArrayList<>();
        final var customer = new Customer();
        customer.setId(UUID.fromString("20dc5ca2-7eb0-4211-888f-c6fbce9965ca"));
        customer.setName("Test Customer");
        customer.setType(CustomerType.REGULAR);
        customerList.add(customer);
        return customerList;
    }


    private List<Product> defaultProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(Product.builder()
                .id(UUID.fromString("8f802b34-0cab-4ee3-9d97-f680fef0bd49"))
                .basePrice(BigDecimal.valueOf(10.00).setScale(2, RoundingMode.HALF_UP))
                .name("Donut")
                .discounts(new ArrayList<>())
                .build());
        productList.add(Product.builder()
                .id(UUID.fromString("4cefb40f-b458-4346-9004-6e9773fa533f"))
                .basePrice(BigDecimal.valueOf(15.00).setScale(2, RoundingMode.HALF_UP))
                .name("Cappuccino")
                .discounts(new ArrayList<>())
                .build());
        return productList;
    }


    private List<ProductDiscount> defaultProductDiscounts() {
        List<ProductDiscount> productDiscountList = new ArrayList<>();
        productDiscountList.add(ProductDiscount.builder()
                .id(UUID.fromString("838c1e58-342a-4a76-8d8f-c6e829a2d65e"))
                .productId(UUID.fromString("8f802b34-0cab-4ee3-9d97-f680fef0bd49"))
                .dateFrom(LocalDate.of(2023, 1, 1))
                .dateTo(LocalDate.of(2100, 1, 1))
                .customerType(CustomerType.REGULAR)
                .discountPercent(BigDecimal.valueOf(10.0).setScale(2, RoundingMode.HALF_UP))
                .build());

        return productDiscountList;
    }
}
