package com.example.shop.service;

import com.example.shop.repository.ShippingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingInfoServiceIpm implements ShippingInfoService{
    @Autowired
    private ShippingInfoRepository shippingInfoRepository;
}
