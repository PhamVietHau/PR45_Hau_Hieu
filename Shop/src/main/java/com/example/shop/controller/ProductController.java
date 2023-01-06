package com.example.shop.controller;

import com.example.shop.entity.Product;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "")
    public Object all() {
        return productService.all();
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        productService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody Product product) {
        productService.save(product);
    }
}
