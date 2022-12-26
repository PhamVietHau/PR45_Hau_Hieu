package com.example.shop.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "paymentmethod")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Order> orderList;

    public PaymentMethod(int id, String name, String description, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.orderList = orderList;
    }

    public PaymentMethod() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}

