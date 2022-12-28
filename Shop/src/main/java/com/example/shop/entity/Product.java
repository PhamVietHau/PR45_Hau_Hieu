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
    private int Id;
//    private int productTypeId;
    private String Name;
//    private int priceId;
    private String Tag;
    private String Description;
    private String Image;
//    private int statusId;
    @OneToMany(mappedBy = "product")
    private List<Amount> amountList;
    @OneToOne(mappedBy = "product")
    private OrderDetail orderDetail;
    @OneToOne
    @JoinColumn(name = "ProductTypeId")
    private ProductType productType;
    @OneToOne
    @JoinColumn(name = "PriceId")
    private Price price;
    @OneToOne
    @JoinColumn(name = "StatusId")
    private Status status;

}
