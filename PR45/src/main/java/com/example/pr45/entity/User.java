package com.example.pr45.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "amount")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int ProductId;
    private int ColorId;
    private int SizeId;
    private int Amount;
}
