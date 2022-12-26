package com.example.shop.service;

import com.example.shop.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SizeServiceIpm implements SizeService{
    @Autowired
    private SizeRepository sizeRepository;
}
