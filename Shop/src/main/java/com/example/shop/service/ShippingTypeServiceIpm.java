package com.example.shop.service;

import com.example.shop.repository.ShippingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingTypeServiceIpm implements ShippingTypeService{
    @Autowired
    private ShippingTypeRepository shippingTypeRepository;
}
