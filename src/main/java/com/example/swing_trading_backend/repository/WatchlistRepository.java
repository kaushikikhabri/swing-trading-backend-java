package com.example.swing_trading_backend.repository;

import com.example.swing_trading_backend.entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
    // Find watchlist entries by emailId
    List<Watchlist> findByEmailId(String emailId);

    // Add method to find a watchlist entry by ticker
    Watchlist findByTicker(String ticker);
}
