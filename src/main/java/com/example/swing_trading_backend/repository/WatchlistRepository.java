package com.example.swing_trading_backend.repository;



import com.example.swing_trading_backend.entity.Alert;
import com.example.swing_trading_backend.entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WatchlistRepository extends JpaRepository<Watchlist, Long> {
    List<Watchlist> findByEmailId(String emailId);
    // Additional query methods can be added here if needed
}
