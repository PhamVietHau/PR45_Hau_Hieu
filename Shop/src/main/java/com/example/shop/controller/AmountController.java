package com.example.shop.controller;

import com.example.shop.service.AmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "amount")
public class AmountController {
    @Autowired
    private AmountService amountService;

    @RequestMapping(value = "all")
    public Object getAll() {
        return amountService.getAll();
    }
}
