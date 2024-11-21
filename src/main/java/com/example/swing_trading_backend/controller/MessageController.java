package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.LoginRequest;
import com.example.swing_trading_backend.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MessageController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/message")
    public String getMessage() {
        return "Hello World!";
    }

//    @PostMapping("/api/login")
//    public String login(@RequestBody LoginRequest loginRequest) {  //@RequestBody tells Spring to convert the JSON payload into a LoginRequest object automatically.
//
//        // Save the user in the database
//        userService.saveUser(loginRequest);
//
//        // Print email and password to the console (IntelliJ terminal)
//        System.out.println("Email: " + loginRequest.getEmail());
//        System.out.println("Password: " + loginRequest.getPassword());
//
//        // Return a response message
//        return "{\"message\": \"Login successful!\"}";
//    }

    // Register endpoint
    @PostMapping("/api/register")
    public String register(@RequestBody LoginRequest loginRequest) {
        // Save the user in the database
        userService.saveUser(loginRequest);

        // Print email and password to the console (for testing purposes)
        System.out.println("Email: " + loginRequest.getEmail());
        System.out.println("Password: " + loginRequest.getPassword());

        // Return a response message indicating successful registration
        return "{\"message\": \"Registration successful!\"}";
    }

     //Login endpoint
    @PostMapping("/api/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Check if the user exists in the database
        boolean isValidUser = userService.validateUser(loginRequest);

        if (isValidUser) {
            // Return success message if credentials are correct
            return "{\"message\": \"Successfully logged in!\"}";
        } else {
            // Return error message if credentials are invalid
            return "{\"message\": \"Invalid credentials!\"}";
        }
    }

//    @PostMapping("/api/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
//        // Validate the user credentials
//        boolean isValidUser = userService.validateUser(loginRequest);
//
//        if (isValidUser) {
//            // Fetch the user's ID from the database
//            Long userId;
//            //userId = userService.getUserIdByUsername(loginRequest.getEmail());
//
//            // Store the user ID in the session
//            session.setAttribute("userId", userId);
//
//            // Return a success message
//            return ResponseEntity.ok("{\"message\": \"Successfully logged in!\"}");
//        } else {
//            // Return an error message
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"message\": \"Invalid credentials!\"}");
//        }
//    }



//
//    @PostMapping("/api/count")
//    public ResponseEntity<String> updateCount(@RequestBody Map<String, Integer> payload) {
//        Integer count = payload.get("count");
//        userService.updateUserCount(count); // Implement this method to save count in the database
//        return ResponseEntity.ok("Count updated successfully");
//    }


}
