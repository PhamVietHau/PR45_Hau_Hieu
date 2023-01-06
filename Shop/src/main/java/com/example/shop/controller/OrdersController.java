package com.example.shop.controller;

import com.example.shop.entity.Orders;
import com.example.shop.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping(value = "")
    public Object all() {
        return ordersService.all();
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        ordersService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody Orders orders) {
        ordersService.save(orders);
    }
}
