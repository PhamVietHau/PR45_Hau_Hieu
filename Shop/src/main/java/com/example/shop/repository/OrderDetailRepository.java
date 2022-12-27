package com.example.shop.repository;

import com.example.shop.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail,Integer> {
}
