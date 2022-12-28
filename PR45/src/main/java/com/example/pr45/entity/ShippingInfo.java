package com.example.pr45.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shippinginfo")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Phone;
    private String City;
    private String County;
    private String Country;



    public ShippingInfo() {
    }


}
