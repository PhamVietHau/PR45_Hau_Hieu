package com.example.shop.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int userId;
//    private int paymentMethodId;
//    private int couponId;
    private int total;
//    private int statusId;
//    private int shippingInfoId;
//    private int shippingTypeId;
    private Date timeCreate;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @OneToOne
    @JoinColumn(name = "paymentMethodId")
    private PaymentMethod paymentMethod;
    @OneToOne
    @JoinColumn(name = "couponId")
    private Coupon coupon;
    @OneToOne
    @JoinColumn(name = "statusId")
    private Status status;
    @OneToOne
    @JoinColumn(name = "shippingInfoId")
    private ShippingInfo shippingInfo;
    @OneToOne
    @JoinColumn(name = "shippingTypeId")
    private ShippingType shippingType;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList;

    public Order(int id, int total, Date timeCreate, User user, PaymentMethod paymentMethod, Coupon coupon, Status status, ShippingInfo shippingInfo, ShippingType shippingType, List<OrderDetail> orderDetailList) {
        this.id = id;
        this.total = total;
        this.timeCreate = timeCreate;
        this.user = user;
        this.paymentMethod = paymentMethod;
        this.coupon = coupon;
        this.status = status;
        this.shippingInfo = shippingInfo;
        this.shippingType = shippingType;
        this.orderDetailList = orderDetailList;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public ShippingType getShippingType() {
        return shippingType;
    }

    public void setShippingType(ShippingType shippingType) {
        this.shippingType = shippingType;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
