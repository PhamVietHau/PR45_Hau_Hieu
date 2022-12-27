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

}
