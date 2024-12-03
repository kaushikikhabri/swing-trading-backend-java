package com.example.swing_trading_backend.repository;

import com.example.swing_trading_backend.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByEmailId(String emailId);
    // Additional query methods can be added here if needed
}
