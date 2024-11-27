package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.AlertRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    @PostMapping
    public ResponseEntity<String> createAlert(@RequestBody AlertRequest alertRequest) {
        // Print the AlertRequest data to the console
        System.out.println("Received AlertRequest:");
        System.out.println("User ID: " + alertRequest.getUserId());
        System.out.println("UUID: " + alertRequest.getUuid());
        System.out.println("Ticker: " + alertRequest.getTicker());
        System.out.println("Current Price: " + alertRequest.getCurrentPrice());
        System.out.println("Operator: " + alertRequest.getOperator());
        System.out.println("Alert Price: " + alertRequest.getAlertPrice());
        System.out.println("Created At: " + alertRequest.getCreatedAt());

        // Respond back after processing the alert request
        return ResponseEntity.ok("Alert created successfully!");
    }
}
