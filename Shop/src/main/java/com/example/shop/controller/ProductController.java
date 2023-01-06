package com.example.shop.controller;

import com.example.shop.entity.Product;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "")
    public Object all(
            @RequestParam(name = "page",defaultValue = "0") int page,
            @RequestParam(name = "count",defaultValue = "30") int count,
            @RequestParam(name = "id",defaultValue = "-1") int id,
            @RequestParam(name = "productTypeId",defaultValue = "-1") int productTypeId,
            @RequestParam(name = "name",defaultValue = "") String name,
            @RequestParam(name = "priceId",defaultValue = "-1") int priceId,
            @RequestParam(name = "descripion",defaultValue = "") String descripion
    ) {
        List<Product> productList = productService.all();
        List<Product> productListReturn = new ArrayList<>();
        int rowFrom = page * count;
        int rowTo = page * count + count;
        if(id == -1
            && productTypeId == -1
            && name.equals("")
            && priceId == -1
            && descripion.equals(""))
            return productList.subList(rowFrom,rowTo > productList.size() ? productList.size() : rowTo);
        for (Product product : productList) {
            Product productClone = null;
            if(id != -1) if(product.getId() == id) productClone = product; else continue;
            if(productTypeId != -1) if(product.getProductType().getId() == productTypeId) productClone = product; else continue;
            if(!name.equals("")) if(product.getName().toLowerCase().contains(name.toLowerCase())) productClone = product; else continue;
            if(priceId != -1) if(product.getPrice().getId() == priceId) productClone = product; else continue;
            if(!descripion.equals("")) if(product.getDescription().toLowerCase().contains(descripion.toLowerCase())) productClone = product; else continue;
            if(productClone != null) productListReturn.add(productClone);
        }

        return productListReturn.subList(rowFrom,rowTo > productListReturn.size() ? productListReturn.size() : rowTo);
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        productService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody Product product) {
        productService.save(product);
    }
    @RequestMapping(value = "/count")
    public Object count() {
        HashMap<String,Integer> count = new HashMap<>();
        count.put("count",productService.all().size());
        return count;
    }
}
