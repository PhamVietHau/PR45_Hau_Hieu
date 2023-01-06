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
@Table(name = "amount")
public class Amount {

    @JsonIgnore
    @EmbeddedId
    private AmountPK amountPK;
//    private int productId;
    @JsonIgnore
    @ManyToOne
    @MapsId("productId")
    private Product product;
//    private int colorId;
    @ManyToOne
    @MapsId("colorId")
    private Color color;
//    private int sizeId;
    @ManyToOne
    @MapsId("sizeId")
    private Size size;
    private int amount;
    private String image;
}
