package com.pragma.ordermanagement.service;

import com.pragma.ordermanagement.model.Order;
import com.pragma.ordermanagement.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OrderService {
    private Map<String, Order> orders = new ConcurrentHashMap<>();

    public Order createOrder(String id) {
        Order order = new Order(id, new ArrayList<>());
        orders.put(id, order);
        return order;
    }

    public Order getOrder(String id) {
        return orders.get(id);
    }

    public void addProductToOrder(String orderId, Product product) {
        Order order = orders.get(orderId);
        if (order!= null) {
            order.addProduct(product);
        }
    }

    public void removeProductFromOrder(String orderId, Product product) {
        Order order = orders.get(orderId);
        if (order!= null) {
            order.removeProduct(product);
        }
    }

    public void updateProductQuantityInOrder(String orderId, Product product, int quantity) {
        Order order = orders.get(orderId);
        if (order!= null) {
            order.updateProductQuantity(product, quantity);
        }
    }
}