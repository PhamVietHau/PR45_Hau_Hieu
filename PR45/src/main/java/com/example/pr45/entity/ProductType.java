package com.example.pr45.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producttype")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;

    public ProductType() {
    }


}
