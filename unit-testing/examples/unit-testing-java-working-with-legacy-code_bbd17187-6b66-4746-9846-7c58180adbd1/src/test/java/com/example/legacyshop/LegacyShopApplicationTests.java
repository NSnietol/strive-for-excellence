package com.example.legacyshop;

import com.example.legacyshop.dto.OrderInfoDTO;
import com.example.legacyshop.dto.OrderLineDTO;
import com.example.legacyshop.model.OrderStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LegacyShopApplicationTests {

    private static final UUID CUSTOMER_ID = UUID.fromString("20dc5ca2-7eb0-4211-888f-c6fbce9965ca");
    private final MockMvc mockMvc;
    private final ObjectMapper objectMapper;

    @Autowired
    LegacyShopApplicationTests(MockMvc mockMvc, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }

    @Test
    void when_requestAllOrders_expectListOfOrders() throws Exception {
        UUID randomUUIDForCustomer = UUID.randomUUID();
        mockMvc.perform(post("/orders?customerID={customerID}", randomUUIDForCustomer))
                .andExpect(status().isOk());
        mockMvc.perform(post("/orders?customerID={customerID}", randomUUIDForCustomer))
                .andExpect(status().isOk());
        mockMvc.perform(post("/orders?customerID={customerID}", randomUUIDForCustomer))
                .andExpect(status().isOk());


        mockMvc.perform(get("/orders?customerID={customerID}", randomUUIDForCustomer))
                .andExpect(result -> status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(3)));

    }

    @Test
    void when_createAOrder_expectGetInFromService() throws Exception {
        UUID anonymousCustomerUUID = UUID.randomUUID();
        AtomicReference<OrderInfoDTO> createdOrder = new AtomicReference<>();

        mockMvc.perform(post("/orders?customerID={customerID}", anonymousCustomerUUID))
                .andExpect(status().isOk())
                .andDo(result -> createdOrder.set(mapResponseIntoOrderInfo(result)));

        UUID orderId = createdOrder.get().getId();

        mockMvc.perform(get("/orders/{id}", orderId))
                .andExpect(result -> status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(result -> {
                    OrderInfoDTO retrievedOrder = mapResponseIntoOrderInfo(result);
                    assertEquals(createdOrder.get(), retrievedOrder);
                });

    }

    @Test
    void when_createDraftOrder_expectToHaveItInDraftStatus() throws Exception {

        UUID anonymousCustomerUUID = UUID.randomUUID();

        OrderInfoDTO expectedOrderInfo = OrderInfoDTO.builder().createdAt(LocalDate.now())
                .amount(BigDecimal.ZERO)
                .status(OrderStatus.DRAFT)
                .lines(new ArrayList<>())
                .build();

        mockMvc.perform(
                post("/orders?customerID={customerID}", anonymousCustomerUUID)
        ).andExpect(
                status().isOk()
        ).andDo(result -> {
            OrderInfoDTO orderInfoDTO = mapResponseIntoOrderInfo(result);
            expectedOrderInfo.setId(orderInfoDTO.getId());

            assertEquals(expectedOrderInfo, orderInfoDTO);
        });
    }

    @Test
    void insertOrderLine_simple_calculated() throws Exception {
        OrderLineDTO expectedOrderLineInfo = OrderLineDTO
                .builder()
                .product("Donut")
                .quantity(3)
                .price(new BigDecimal("10.00"))
                .discount(new BigDecimal("1.00"))
                .amount(new BigDecimal("27.00"))
                .build();


        AtomicReference<UUID> orderId = new AtomicReference<>();
        mockMvc.perform(
                post("/orders?customerID={customerID}", CUSTOMER_ID)
        ).andExpect(
                status().isOk()
        ).andDo(response -> {
            OrderInfoDTO info = mapResponseIntoOrderInfo(response);
            orderId.set(info.getId());
        });

        mockMvc.perform(post("/orders/{orderID}/lines", orderId.get().toString())
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .content("product=Donut&quantity=3")
        ).andExpectAll(
                status().isOk(),
                jsonPath("$.lines", hasSize(1))
        ).andDo(r -> {
            OrderInfoDTO info = mapResponseIntoOrderInfo(r);
            assertEquals(OrderStatus.DRAFT, info.getStatus());
            assertEquals(1, info.getLines().size());
            assertEquals(expectedOrderLineInfo, info.getLines().get(0));
            assertEquals("27.00", info.getAmount().toString());
        });
        ;
    }

    private OrderInfoDTO mapResponseIntoOrderInfo(MvcResult r) throws JsonProcessingException, UnsupportedEncodingException {
        return objectMapper.readValue(r.getResponse().getContentAsString(), OrderInfoDTO.class);
    }
}
