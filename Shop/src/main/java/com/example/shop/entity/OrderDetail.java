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
    private int Id;
//    private int orderId;
//    private int productId;
    private int Quantity;
    private int Total;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;
    @OneToOne
    @JoinColumn(name = "ProductId")
    private Product product;


}
