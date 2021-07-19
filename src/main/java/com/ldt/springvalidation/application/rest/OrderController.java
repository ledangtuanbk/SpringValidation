package com.ldt.springvalidation.application.rest;

import com.ldt.springvalidation.application.request.CreateOrderRequest;
import com.ldt.springvalidation.application.response.CreateOrderResponse;
import com.ldt.springvalidation.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/create")
    CreateOrderResponse createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        UUID orderId = orderService.createOrder(createOrderRequest.getProduct());
        return new CreateOrderResponse(orderId);
    }

    @PostMapping("/complete/{id}")
    void complete(@PathVariable UUID id) {
        orderService.complete(id);
    }

}
