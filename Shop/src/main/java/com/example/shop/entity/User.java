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
    private int Id;
//    private int roleId;
    private String UserName;
    private String Password;
    private String Email;


    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    @OneToMany(mappedBy = "user")
    private List<ShippingInfo> shippingInfoList;
    @ManyToOne
    @JoinColumn(name = "RoleId")
    private Role role;


}
