package com.example.swing_trading_backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AlertRequest {

    private String emailId; // Changed from UUID to Long
    private String ticker;
    private String operator;
    private BigDecimal alertPrice;
    private LocalDateTime createdAt;


    // Getters and Setters
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {this.emailId = emailId;}

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public BigDecimal getAlertPrice() {
        return alertPrice;
    }

    public void setAlertPrice(BigDecimal alertPrice) {
        this.alertPrice = alertPrice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
