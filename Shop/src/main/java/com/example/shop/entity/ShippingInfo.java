package com.example.shop.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shippinginfo")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int userId;
    private String name;
    private String phone;
    private String street;
    private String city;
    private String county;
    private String country;
    private String other;
    @OneToMany(mappedBy = "shippingInfo")
    private List<Order> orderList;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
