package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.LoginRequest;
import com.example.swing_trading_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/register")
    public String register(@RequestBody LoginRequest loginRequest) {
        userService.saveUser(loginRequest);

        System.out.println("Email: " + loginRequest.getEmail());
        System.out.println("Password: " + loginRequest.getPassword());

        return "{\"message\": \"Registration successful!\"}";
    }

    @PostMapping("/api/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        boolean isValidUser = userService.validateUser(loginRequest);

        if (isValidUser) {
            return "{\"message\": \"Successfully logged in!\"}";
        } else {
            return "{\"message\": \"Invalid credentials!\"}";
        }
    }
}
