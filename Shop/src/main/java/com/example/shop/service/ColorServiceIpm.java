package com.example.shop.service;

import com.example.shop.entity.Color;
import com.example.shop.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceIpm implements ColorService{
    @Autowired
    private ColorRepository colorRepository;


}
