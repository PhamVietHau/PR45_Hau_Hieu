package com.example.shop.service;

import com.example.shop.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceIpm implements StatusService{
    @Autowired
    private StatusRepository statusRepository;
}
