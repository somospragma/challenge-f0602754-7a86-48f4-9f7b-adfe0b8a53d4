package com.pragma.ordermanagement.controller;

import com.pragma.ordermanagement.model.Order;
import com.pragma.ordermanagement.model.Product;
import com.pragma.ordermanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestParam String id) {
        return orderService.createOrder(id);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id) {
        return orderService.getOrder(id);
    }

    @PutMapping("/{id}/products")
    public Order addProductToOrder(@PathVariable String id, @RequestBody Product product) {
        orderService.addProductToOrder(id, product);
        return orderService.getOrder(id);
    }

    @DeleteMapping("/{id}/products/{productId}")
    public Order removeProductFromOrder(@PathVariable String id, @PathVariable String productId) {
        Product product = new Product(productId, "", 0);
        orderService.removeProductFromOrder(id, product);
        return orderService.getOrder(id);
    }

    @PatchMapping("/{id}/products/{productId}")
    public Order updateProductQuantityInOrder(@PathVariable String id, @PathVariable String productId, @RequestParam int quantity) {
        Product product = new Product(productId, "", quantity);
        orderService.updateProductQuantityInOrder(id, product, quantity);
        return orderService.getOrder(id);
    }
}