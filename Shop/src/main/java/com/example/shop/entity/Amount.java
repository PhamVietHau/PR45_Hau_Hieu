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
    private int Id;
//    private int productId;
//    private int colorId;
//    private int sizeId;
    private int Amount;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "ColorId")
    private Color color;
    @OneToOne
    @JoinColumn(name = "SizeId")
    private Size size;
}
