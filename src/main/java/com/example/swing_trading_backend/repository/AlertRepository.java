package com.example.swing_trading_backend.repository;

import com.example.swing_trading_backend.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
    // Additional query methods can be added here if needed
}
