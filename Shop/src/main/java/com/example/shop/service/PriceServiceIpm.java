package com.example.shop.service;

import com.example.shop.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceIpm implements PriceService{
    @Autowired
    private PriceRepository priceRepository;
}
