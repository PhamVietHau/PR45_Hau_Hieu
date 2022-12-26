package com.example.shop.repository;

import com.example.shop.entity.PaymentMethod;
import org.springframework.data.repository.CrudRepository;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethod,Integer> {
}
