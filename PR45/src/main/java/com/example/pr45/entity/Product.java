package com.example.pr45.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Tag;
    private String Description;
    private String Image;

    public Product() {
    }


}
