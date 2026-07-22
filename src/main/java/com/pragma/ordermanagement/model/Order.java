package com.pragma.ordermanagement.model;

import java.util.List;

public class Order {
    private String id;
    private List<Product> products;

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void updateProductQuantity(Product product, int quantity) {
        int index = products.indexOf(product);
        if (index!= -1) {
            products.get(index).setQuantity(quantity);
        }
    }
}