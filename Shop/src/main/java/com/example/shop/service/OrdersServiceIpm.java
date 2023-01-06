package com.example.shop.service;

import com.example.shop.entity.Orders;
import com.example.shop.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceIpm implements OrdersService{
    @Autowired
    private OrdersRepository ordersRepository;
    @Override
    public List<Orders> all() {
        return (List<Orders>) ordersRepository.findAll();
    }
    @Override
    public void delete(int id) {
        ordersRepository.deleteById(id);
    }
    @Override
    public void save(Orders orders) {
        ordersRepository.save(orders);
    }
}
