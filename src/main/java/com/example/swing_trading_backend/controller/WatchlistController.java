package com.example.swing_trading_backend.controller;

import com.example.swing_trading_backend.dto.AlertRequest;
import com.example.swing_trading_backend.dto.WatchlistRequest;
import com.example.swing_trading_backend.service.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    @RequestMapping("/api/watchlist")
    public class WatchlistController {

        @Autowired
        private WatchlistService watchlistService;

        @PostMapping("createWatchlist")
        public ResponseEntity<String> watchlist(@RequestBody WatchlistRequest watchlistRequest) {
            // Call the service to process the request
            //String responseMessage = alertService.createAlert(alertRequest);
            //watchlistRequest.setTicker()

            System.out.println("Inside COntroller "+watchlistRequest.getTicker());

            watchlistService.createWatchlist(watchlistRequest);

            return ResponseEntity.ok(watchlistRequest.getTicker());
        }






    }


