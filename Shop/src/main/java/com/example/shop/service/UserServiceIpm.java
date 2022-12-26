package com.example.shop.service;

import com.example.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIpm implements UserService{
    @Autowired
    private UserRepository userRepository;
}
