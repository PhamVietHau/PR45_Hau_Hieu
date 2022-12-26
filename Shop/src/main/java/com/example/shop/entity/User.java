package com.example.shop.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
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

    public User(int id, String userName, String password, String email, Date timeCreate, List<Order> orderList, List<ShippingInfo> shippingInfoList, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.timeCreate = timeCreate;
        this.orderList = orderList;
        this.shippingInfoList = shippingInfoList;
        this.role = role;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<ShippingInfo> getShippingInfoList() {
        return shippingInfoList;
    }

    public void setShippingInfoList(List<ShippingInfo> shippingInfoList) {
        this.shippingInfoList = shippingInfoList;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
