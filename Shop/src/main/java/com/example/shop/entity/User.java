package com.example.shop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;
    private String userName;
    private String password;
    private String email;
    private Date timeCreate;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Orders> ordersList;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<ShippingInfo> shippingInfoList;
}
