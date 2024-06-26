package com.example.secondspring.entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String orderNumber;

    @ManyToMany(mappedBy = "orders", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Product> products;

    @ManyToMany(mappedBy = "orders", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Customer> customers;
    public Order() {
    }

    public Order(long id, String orderNumber, Set<Product> products) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
