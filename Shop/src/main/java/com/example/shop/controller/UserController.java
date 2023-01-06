package com.example.shop.controller;

import com.example.shop.entity.User;
import com.example.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public Object all() {

        return userService.all();
    }
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    public void delete(@RequestParam(name = "id") int id) {
        userService.delete(id);
    }
    @RequestMapping(value = "",method = RequestMethod.PUT)
    public void update(@RequestBody User user) {
        userService.save(user);
    }
    @RequestMapping(value = "/count")
    public Object count() {
        HashMap<String,Integer> count = new HashMap<>();
        count.put("count",userService.all().size());
        return count;
    }
}
