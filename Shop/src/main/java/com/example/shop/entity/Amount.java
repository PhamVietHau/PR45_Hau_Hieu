package com.example.shop.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "amount")
@IdClass(AmountId.class)
public class Amount {

//    private int productId;
//    private int colorId;
//    private int sizeId;
//    private int amount;
    @Id
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name = "colorId")
    private Color color;
    @Id
    @ManyToOne
    @JoinColumn(name = "sizeId")
    private Size size;
    @Column(name = "amount")
    private int amount;
}
