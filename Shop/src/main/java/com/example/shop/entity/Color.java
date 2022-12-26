package com.example.shop.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "color")
    private List<Amount> amountList;

    public Color(int id, String name, List<Amount> amountList) {
        this.id = id;
        this.name = name;
        this.amountList = amountList;
    }

    public Color() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Amount> getAmountList() {
        return amountList;
    }

    public void setAmountList(List<Amount> amountList) {
        this.amountList = amountList;
    }
}
