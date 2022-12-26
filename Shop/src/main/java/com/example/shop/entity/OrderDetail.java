package com.example.shop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orderdetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private int orderId;
//    private int productId;
    private int quantity;
    private int total;

    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    public OrderDetail(int id, int quantity, int total, Order order, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.total = total;
        this.order = order;
        this.product = product;
    }

    public OrderDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
