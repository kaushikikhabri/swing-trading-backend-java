package com.example.swing_trading_backend.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

//stock_symbol = tikcer
@Entity
@Table(name = "watchlist")
public class Watchlist
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id for a watchlist
    private Long id;

    @Column(name = "ticker", length = 50, unique = true)  // Added 'unique = true' here
    private String ticker;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "email_id", length = 255)
    private String emailId;

    //setter and getters

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setWatchlistId(Long Watchlistid)
    {
        this.id = Watchlistid;
    }

    public Long getWatchlistId() {
        return id;
    }

    public void setTicker(String ticker)
    {
        this.ticker = ticker;
    }

    public String getTicker()
    {
        return ticker;
    }

    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }



}
