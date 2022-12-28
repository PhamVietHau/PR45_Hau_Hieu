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
    private int Id;
//    private int userId;
//    private int paymentMethodId;
//    private int couponId;
    private int Total;
//    private int statusId;
//    private int shippingInfoId;
//    private int shippingTypeId;
    private Date TimeCreate;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User user;
    @ManyToOne
    @JoinColumn(name = "PaymentMethodId")
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "CouponId")
    private Coupon coupon;
    @OneToOne
    @JoinColumn(name = "StatusId")
    private Status status;
    @ManyToOne
    @JoinColumn(name = "ShippingInfoId")
    private ShippingInfo shippingInfo;
    @ManyToOne
    @JoinColumn(name = "ShippingTypeId")
    private ShippingType shippingType;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList;

}
