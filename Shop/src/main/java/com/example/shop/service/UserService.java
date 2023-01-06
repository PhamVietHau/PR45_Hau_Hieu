package com.example.shop.service;

import com.example.shop.entity.User;

import java.util.List;

public interface UserService {
    public List<User> all();
    public void delete(int id);
    public void save(User user);
}
