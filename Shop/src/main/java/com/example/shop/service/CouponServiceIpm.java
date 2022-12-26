package com.example.shop.service;

import com.example.shop.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceIpm implements CouponService{
    @Autowired
    private CouponRepository couponRepository;
}
