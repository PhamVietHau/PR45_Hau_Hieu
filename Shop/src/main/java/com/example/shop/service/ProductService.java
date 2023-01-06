package com.example.shop.service;

import com.example.shop.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> all();
    public void delete(int id);
    public void save(Product product);
}
