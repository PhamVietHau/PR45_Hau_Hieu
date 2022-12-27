package com.example.shop.controller;

import com.example.shop.entity.Color;
import com.example.shop.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    @Autowired
    private ColorService colorService;

    @RequestMapping(method = RequestMethod.GET,value = "/color")
    public Object getAll() {
        return colorService.getAll();
    }
}
