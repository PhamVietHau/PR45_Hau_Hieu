package com.example.shop.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "amount")
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int productId;
//    private int colorId;
//    private int sizeId;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "colorId")
    private Color color;
    @OneToOne
    @JoinColumn(name = "sizeId")
    private Size size;
}
