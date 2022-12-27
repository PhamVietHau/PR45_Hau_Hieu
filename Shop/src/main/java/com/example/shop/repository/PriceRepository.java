package com.example.shop.repository;

import com.example.shop.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price,Integer> {
}
