package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }
    @Transactional
    
    public User save(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User entity must not be null");
        }
        
        return userRepository.findByUsername(null); // Ensure the User type matches here
    }
    
    
}
