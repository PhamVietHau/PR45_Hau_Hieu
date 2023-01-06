package com.example.shop.service;

import com.example.shop.entity.User;

import java.util.List;

public interface UserService {
    public List<User> all();
    public void delete(int id);
    public void update(User user);
    public void updates(List<User> userList);
}
