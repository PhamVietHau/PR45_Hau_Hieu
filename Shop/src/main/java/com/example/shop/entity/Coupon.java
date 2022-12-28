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
    private int Id;
    private String Name;
    private String Description;
    private String Code;
    private int Điscount;
    private int MaxDiscountAmount;
    private Date Expired;
    private int Usage;
    private boolean Enable;

    @OneToMany(mappedBy = "coupon")
    private List<Order> orderList;

}
