package com.example.swing_trading_backend.repository;



import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
    // Additional query methods can be added here if needed
}
