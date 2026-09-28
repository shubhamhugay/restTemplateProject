package com.rogerstore.ecomorderservice.controllers;

import com.rogerstore.ecomorderservice.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private final RestTemplate restTemplate;

    public OrderController(OrderService orderService, RestTemplate restTemplate) {
        this.orderService = orderService;
        this.restTemplate = restTemplate;
    }


    @PostMapping("/{productId}")
    public String orderPlace(@PathVariable String productId) {
        String response = restTemplate.getForObject(
                "http://localhost:8080/inventory/" +productId,
                String.class
        );
        return "in Stock".equals(response)
                ? "Order PLaced" : "order not PLaced";
    }
}
