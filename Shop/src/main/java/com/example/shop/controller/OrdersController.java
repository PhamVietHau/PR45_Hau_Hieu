package com.example.shop.controller;

import com.example.shop.entity.Orders;
import com.example.shop.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @RequestMapping(value = "")
    public Object all(
            @RequestParam(name = "page",defaultValue = "0") int page,
            @RequestParam(name = "count",defaultValue = "30") int count,
            @RequestParam(name = "id",defaultValue = "-1") int id,
            @RequestParam(name = "userId",defaultValue = "-1") int userId,
            @RequestParam(name = "paymentMethodId",defaultValue = "-1") int paymentMethodId,
            @RequestParam(name = "couponId",defaultValue = "-1") int couponId,
            @RequestParam(name = "statusId",defaultValue = "-1") int statusId,
            @RequestParam(name = "shippingInfoId",defaultValue = "-1") int shippingInfoId,
            @RequestParam(name = "shippingTypeId",defaultValue = "-1") int shippingTypeId,
            @RequestParam(name = "from",defaultValue = "1970-01-01") LocalDate from,
            @RequestParam(name = "to",defaultValue = "1970-01-01") LocalDate to
    ) {
        List<Orders> ordersList = ordersService.all();
        List<Orders> ordersListReturn = new ArrayList<>();
        int rowFrom = page * count;
        int rowTo = page * count + count;
        if(id == -1
                && userId == -1
                && paymentMethodId == -1
                && couponId == -1
                && statusId == -1
                && shippingInfoId == -1
                && userId == -1
                && shippingTypeId == -1
                && from.isEqual(LocalDate.parse("1970-01-01"))
                && to.isEqual(LocalDate.parse("1970-01-01"))) return ordersList.subList(rowFrom,rowTo > ordersList.size() ? ordersList.size() : rowTo);
        for(Orders orders : ordersList) {
            Orders ordersClone = null;
            if(id != -1) if(orders.getId() == id) ordersClone = orders; else continue;
            if(userId != -1) if(orders.getUser().getId() == userId) ordersClone = orders; else continue;
            if(paymentMethodId != -1) if(orders.getPaymentMethod().getId() == paymentMethodId) ordersClone = orders; else continue;
            if(couponId != -1) if(orders.getCoupon().getId() == couponId) ordersClone = orders; else continue;
            if(statusId != -1) if(orders.getStatus().getId() == statusId) ordersClone = orders; else continue;
            if(shippingInfoId != -1) if(orders.getShippingInfo().getId() == shippingInfoId) ordersClone = orders; else continue;
            if(shippingTypeId != -1) if(orders.getShippingType().getId() == shippingTypeId) ordersClone = orders; else continue;
            if(!from.isEqual(LocalDate.parse("1970-01-01"))) if(orders.getTimeCreate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isAfter(from.minusDays(1))) ordersClone = orders; else continue;
            if(!to.isEqual(LocalDate.parse("1970-01-01"))) if(orders.getTimeCreate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(to.plusDays(1))) ordersClone = orders; else continue;
            if(ordersClone != null) ordersListReturn.add(ordersClone);
        }
        return ordersListReturn.subList(rowFrom,rowTo > ordersListReturn.size() ? ordersListReturn.size() : rowTo);
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        ordersService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody Orders orders) {
        ordersService.save(orders);
    }
    @RequestMapping(value = "/count")
    public Object count() {
        HashMap<String,Integer> count = new HashMap<>();
        count.put("count",ordersService.all().size());
        return count;
    }
}
