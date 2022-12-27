package com.example.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orderdetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int orderId;
//    private int productId;
    private int quantity;
    private int total;

    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;


}
