package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping
    public ResponseEntity<String> createAlert(@RequestBody AlertRequest alertRequest) {
        // Call the service to process the request
        String responseMessage = alertService.createAlert(alertRequest);

        // Respond back after processing the alert request
        return ResponseEntity.ok(responseMessage);
    }
}
