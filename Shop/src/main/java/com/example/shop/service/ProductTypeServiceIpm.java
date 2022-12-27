package com.example.shop.service;

import com.example.shop.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceIpm implements ProductTypeService{
    @Autowired
    private ProductTypeRepository productTypeRepository;
}
