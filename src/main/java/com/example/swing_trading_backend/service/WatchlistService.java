package com.example.swing_trading_backend.service;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.dto.WatchlistRequest;
import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.entity.Watchlist;
import com.example.swing_trading_backend.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

//business logic here
@Service
public class WatchlistService {

    @Autowired
    private WatchlistRepository watchlistRepository;

    public String createWatchlist(WatchlistRequest watchlistRequest) {
        // Map WatchlistRequest DTO to Watchlist entity
        Watchlist watchlist = new Watchlist(); //Watchlist entity object

        //Passing data from DTO to entity
        watchlist.setWatchlistId(watchlistRequest.getId());
        watchlist.setTicker(watchlistRequest.getTicker());
//        watchlist.setEmailId(watchlistRequest.getEmailId());
        watchlist.setEmailId("email@example.com"); //remove this later
        watchlist.setCreatedAt(LocalDateTime.now());

        // Save the alert to the database
        watchlistRepository.save(watchlist);
        System.out.println("Inside service "+watchlist.getTicker());

        return "Inside Watchlist Service";
    }
}
