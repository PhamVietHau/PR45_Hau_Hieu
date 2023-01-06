package com.example.shop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
//    private int ordersId;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ordersId")
    private Orders orders;
//    private int productId;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private int quantity;
    private int total;

}
