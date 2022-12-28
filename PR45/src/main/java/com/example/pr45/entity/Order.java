package com.example.pr45.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int UserId;
    private int PaymentMethodId;
    private int CouponId;
    private int Total;
    private int StatusId;
    private int ShippingInfoId;
    private int ShippingTypeId;

}
