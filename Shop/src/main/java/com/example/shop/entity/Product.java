package com.example.shop.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int productTypeId;
    private String name;
//    private int priceId;
    private String tag;
    private String description;
    private String image;
    private Date timeCreate;
//    private int statusId;
    @OneToMany(mappedBy = "product")
    private List<Amount> amountList;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetailList;
    @OneToOne
    @JoinColumn(name = "productTypeId")
    private ProductType productType;
    @OneToOne
    @JoinColumn(name = "priceId")
    private Price price;
    @OneToOne
    @JoinColumn(name = "statusId")
    private Status status;

    public Product(int id, String name, String tag, String description, String image, Date timeCreate, List<Amount> amountList, List<OrderDetail> orderDetailList, ProductType productType, Price price, Status status) {
        this.id = id;
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.image = image;
        this.timeCreate = timeCreate;
        this.amountList = amountList;
        this.orderDetailList = orderDetailList;
        this.productType = productType;
        this.price = price;
        this.status = status;
    }

    public Product() {
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public List<Amount> getAmountList() {
        return amountList;
    }

    public void setAmountList(List<Amount> amountList) {
        this.amountList = amountList;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
