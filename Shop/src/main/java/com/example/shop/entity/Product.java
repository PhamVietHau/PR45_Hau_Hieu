package com.example.shop.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int productTypeId;
    private String name;
//    private int priceId;
    private String tag;
    private String description;
    private String image;
//    private int statusId;
    @OneToMany(mappedBy = "product")
    private List<Amount> amountList;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetailList;
    @OneToOne
    @JoinColumn(name = "productTypeId")
    private ProductType productType;
    @OneToOne
    @JoinColumn(name = "priceId")
    private Price price;
    @OneToOne
    @JoinColumn(name = "statusId")
    private Status status;

}
