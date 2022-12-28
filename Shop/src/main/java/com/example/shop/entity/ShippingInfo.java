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
    private int Id;
//    private int userId;
    private String Name;
    private String Phone;
    private String Line1;
    private String City;
    private String County;
    private String Zip;
    private String Country;
    private String Other;

    @OneToMany(mappedBy = "shippingInfo")
    private List<Order> orderList;
    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;


}
