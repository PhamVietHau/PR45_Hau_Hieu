package com.example.shop.service;

import com.example.shop.entity.Product;
import com.example.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIpm implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> all() {
        return (List<Product>) productRepository.findAll();
    }
    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
