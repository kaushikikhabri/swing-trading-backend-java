package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.dto.LoginRequest;
import com.example.swing_trading_backend.entity.User;
import com.example.swing_trading_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(LoginRequest loginRequest) {
        User user = new User();
        user.setEmail(loginRequest.getEmail());
        user.setPassword(loginRequest.getPassword()); // You may want to hash the password here before saving
        userRepository.save(user);
    }
}
