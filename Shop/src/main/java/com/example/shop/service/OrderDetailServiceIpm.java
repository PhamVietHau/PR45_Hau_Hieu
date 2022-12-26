package com.example.shop.service;

import com.example.shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceIpm implements OrderDetailService{
    @Autowired
    private OrderRepository orderRepository;
}
