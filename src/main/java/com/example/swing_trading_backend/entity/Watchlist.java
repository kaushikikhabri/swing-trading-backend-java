package com.example.swing_trading_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "watchlist",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"email_id", "ticker"})} // Composite unique constraint
)
public class Watchlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID for a watchlist
    private Long id;

    @Column(name = "ticker", length = 50)
    private String ticker;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "email_id", length = 255)
    private String emailId;

    // Getters and setters
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setWatchlistId(Long Watchlistid) {
        this.id = Watchlistid;
    }

    public Long getWatchlistId() {
        return id;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getTicker() {
        return ticker;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
