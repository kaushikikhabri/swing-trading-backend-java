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
            System.out.println("Inside Controller "+watchlistRequest.getEmailId());
            watchlistService.createWatchlist(watchlistRequest);
            return ResponseEntity.ok(watchlistRequest.getTicker());
        }

        //end point for fetching watchlist from dtabse for a certain email id
    @GetMapping("/{emailId}")
    public ResponseEntity<List<Watchlist>> getWatchlistByEmail(@PathVariable String emailId) {
        List<Watchlist> watchlist = watchlistService.getWatchlistByEmail(emailId);
        System.out.println("Get watchlist controller: " + emailId);
        return ResponseEntity.ok(watchlist);
    }

    // New endpoint for deleting a stock from the watchlist
    @PostMapping("deleteWatchlist")
    public ResponseEntity<String> deleteWatchlist(@RequestBody WatchlistRequest watchlistRequest) {
        String ticker = watchlistRequest.getTicker();
        String emailId = watchlistRequest.getEmailId(); // Get email ID from the request
        System.out.println("Received Ticker: " + ticker);
        System.out.println("Received EmailId: " + emailId);

        boolean isDeleted = watchlistService.deleteWatchlist(ticker, emailId);


        if (isDeleted) {
            return ResponseEntity.ok("Stock deleted successfully");
        } else {
            return ResponseEntity.status(400).body("Failed to delete stock");
        }
    }
}


