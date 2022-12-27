package com.example.shop.service;

import com.example.shop.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceIpm implements RoleService{
    @Autowired
    private RoleRepository roleRepository;
}
