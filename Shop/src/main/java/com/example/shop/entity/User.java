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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int roleId;
    private String userName;
    private String password;
    private String email;
    private Date timeCreate;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    @OneToMany(mappedBy = "user")
    private List<ShippingInfo> shippingInfoList;
    @OneToOne
    @JoinColumn(name = "roleId")
    private Role role;


}