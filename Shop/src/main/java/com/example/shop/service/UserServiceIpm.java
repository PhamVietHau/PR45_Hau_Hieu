package com.example.shop.service;

import com.example.shop.entity.User;
import com.example.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIpm implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> all() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}
