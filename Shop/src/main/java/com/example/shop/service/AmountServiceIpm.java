package com.example.shop.service;

import com.example.shop.entity.Amount;
import com.example.shop.repository.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmountServiceIpm implements AmountService{
    @Autowired
    private AmountRepository amountRepository;

    @Override
    public List<Amount> getAll() {
        return (List<Amount>) amountRepository.findAll();
    }
}
