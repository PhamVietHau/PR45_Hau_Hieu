package com.example.pr45.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "amount")
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int ColorId;
    private int SizeId;
    private int Amount;

}
