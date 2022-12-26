package com.example.shop.repository;

import com.example.shop.entity.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository extends CrudRepository<ProductType,Integer> {
}
