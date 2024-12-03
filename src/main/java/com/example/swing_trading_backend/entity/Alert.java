package com.example.swing_trading_backend.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "alerts")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email_id", nullable = false, unique = true, length = 255)
    private String emailId;


    @Column(name = "ticker", nullable = false, length = 50)
    private String ticker;

    @Column(name = "operator", nullable = false, length = 5)
    private String operator;

    @Column(name = "alert_price", nullable = false, precision = 15, scale = 10)
    private BigDecimal alertPrice;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

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
