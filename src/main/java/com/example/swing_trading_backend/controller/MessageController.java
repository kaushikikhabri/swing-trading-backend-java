package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.LoginRequest;
import com.example.swing_trading_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/message")
    public String getMessage() {
        return "Hello World!";
    }

    @PostMapping("/api/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Save the user in the database
        userService.saveUser(loginRequest);

        // Print email and password to the console (IntelliJ terminal)
        System.out.println("Email: " + loginRequest.getEmail());
        System.out.println("Password: " + loginRequest.getPassword());

        // Return a response message
        return "{\"message\": \"Login successful!\"}";
    }
}
