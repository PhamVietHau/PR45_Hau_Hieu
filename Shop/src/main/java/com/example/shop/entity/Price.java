package com.example.shop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int price;
    @DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
    private Date timeStart;
    @DateTimeFormat(pattern = "YYYY-MM-DD hh:mm:ss")
    private Date timeEnd;

}
