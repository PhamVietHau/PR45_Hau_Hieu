package com.example.shop.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AmountId implements Serializable {
    private int product;
    private int color;
    private int size;
}
