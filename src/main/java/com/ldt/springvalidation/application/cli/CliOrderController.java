package com.ldt.springvalidation.application.cli;

import com.ldt.springvalidation.application.response.CreateOrderResponse;
import com.ldt.springvalidation.domain.Product;
import com.ldt.springvalidation.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CliOrderController {

    private final OrderService orderService;

    @Autowired
    public CliOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public CreateOrderResponse createOrder() {
//        LOG.info("Placing a new order with two products");
        Product mobilePhone = new Product(UUID.randomUUID(), 100L, "mobile");
        UUID orderId = orderService.createOrder(mobilePhone);
        return new CreateOrderResponse(orderId);
    }
}
