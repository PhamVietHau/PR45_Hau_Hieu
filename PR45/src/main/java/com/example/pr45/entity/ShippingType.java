package com.example.pr45.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shippingtype")
public class ShippingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Service;
    private int cost;

    public ShippingType() {
    }
}
