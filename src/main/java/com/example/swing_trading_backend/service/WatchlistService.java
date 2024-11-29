package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.dto.WatchlistRequest;
import com.example.swing_trading_backend.entity.Alert;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class WatchlistService {

    public String createWatchlist(WatchlistRequest watchlistRequest) {
        // Map AlertRequest DTO to Alert entity
     //Alert alert = new Alert();  ENTITY
//        alert.setUserId(alertRequest.getUserId());
//        alert.setTicker(alertRequest.getTicker());
//        alert.setCurrentPrice(alertRequest.getCurrentPrice());
//        alert.setOperator(alertRequest.getOperator());
//        alert.setAlertPrice(alertRequest.getAlertPrice());
//        alert.setCreatedAt(LocalDateTime.now()); // Automatically set created_at timestamp

        // Save the alert to the database
        //alertRepository.save(alert);
        System.out.println("Inside service "+watchlistRequest.getTicker());

        return "Inside Watchlist Service";
    }
}
