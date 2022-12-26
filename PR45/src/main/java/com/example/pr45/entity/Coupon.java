package com.example.pr45.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Description;
    private String Code;
    private int Discount;
    private int MaxDiscountAmount;
    private Date Expired;
    private int Usage;
    private boolean Enable;
}
