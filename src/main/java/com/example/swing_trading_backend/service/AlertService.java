package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    /**
     * Creates an alert from the provided request and saves it to the database.
     *
     * @param alertRequest DTO containing alert details
     * @return Success message after saving
     */
    public String createAlert(AlertRequest alertRequest) {
        // Map AlertRequest DTO to Alert entity
        Alert alert = new Alert();   //Entity object
        alert.setUserId(alertRequest.getUserId());
        alert.setTicker(alertRequest.getTicker());
        alert.setCurrentPrice(alertRequest.getCurrentPrice());
        alert.setOperator(alertRequest.getOperator());
        alert.setAlertPrice(alertRequest.getAlertPrice());
        alert.setCreatedAt(LocalDateTime.now()); // Automatically set created_at timestamp

        // Save the alert to the database
        alertRepository.save(alert);

        return "Alert created successfully!";
    }
}
