package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping
    public ResponseEntity<String> createAlert(@RequestBody AlertRequest alertRequest) {
        // Call the service to process the request
        System.out.println("Received alert with email_id: " + alertRequest.getEmailId());
        String responseMessage = alertService.createAlert(alertRequest);

        // Respond back after processing the alert request
        return ResponseEntity.ok(responseMessage);
    }

    @GetMapping("/{emailId}")
    public ResponseEntity<List<Alert>> getAlertsByEmail(@PathVariable String emailId) {
        List<Alert> alerts = alertService.getAlertsByEmail(emailId);
        return ResponseEntity.ok(alerts);
    }

}
