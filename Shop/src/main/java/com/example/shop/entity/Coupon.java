package com.example.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String code;
    private int discount;
    private int maxDiscountAmount;
    private Date expired;
    private int usage;
    private boolean enable;
    @OneToMany(mappedBy = "coupon")
    private List<Order> orderList;
}
