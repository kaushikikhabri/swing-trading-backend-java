package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

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
        // Assuming AlertRequest is being converted to Alert somewhere in your service layer:
        Alert alert = new Alert();
        alert.setEmailId(alertRequest.getEmailId());  // Ensure emailId is not null here
        alert.setTicker(alertRequest.getTicker());
        alert.setOperator(alertRequest.getOperator());
        alert.setAlertPrice(alertRequest.getAlertPrice());
        alert.setCreatedAt(alertRequest.getCreatedAt());

        // Save the alert to the database
        alertRepository.save(alert);

        return "Alert created successfully!";
    }

    public List<Alert> getAlertsByEmail(String emailId) {
        return alertRepository.findByEmailId(emailId);
    }

}
