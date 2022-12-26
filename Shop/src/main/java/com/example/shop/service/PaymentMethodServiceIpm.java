package com.example.shop.service;

import com.example.shop.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodServiceIpm implements PaymentMethodService{
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
}
