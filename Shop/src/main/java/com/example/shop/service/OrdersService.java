package com.example.shop.service;

import com.example.shop.entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> all();
    public void delete(int id);
    public void save(Orders orders);
}
