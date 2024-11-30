package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.dto.WatchlistRequest;
import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.entity.Watchlist;
import com.example.swing_trading_backend.service.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/api/watchlist")
    public class WatchlistController {

        @Autowired
        private WatchlistService watchlistService;

        @PostMapping("createWatchlist")
        public ResponseEntity<String> watchlist(@RequestBody WatchlistRequest watchlistRequest) {
            // Call the service to process the request
            System.out.println("Inside COntroller "+watchlistRequest.getEmailId());
            String responseMessage = watchlistService.createWatchlist(watchlistRequest);
            //watchlistRequest.setTicker()

            //System.out.println("Inside COntroller "+watchlistRequest.getTicker());

            watchlistService.createWatchlist(watchlistRequest);

            return ResponseEntity.ok(watchlistRequest.getTicker());
        }

        //end point for fetching watchlist from dtabse for a certain email id
    @GetMapping("/{emailId}")
    public ResponseEntity<List<Watchlist>> getWatchlistByEmail(@PathVariable String emailId) {
        //List<Alert> alerts = alertService.getAlertsByEmail(emailId);
        List<Watchlist> watchlist = watchlistService.getWatchlistByEmail(emailId);


        System.out.println("Get watchlist controller: " + emailId);
        return ResponseEntity.ok(watchlist);
    }






    }


