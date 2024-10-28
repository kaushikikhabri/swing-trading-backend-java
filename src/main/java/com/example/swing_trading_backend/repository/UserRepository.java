package com.example.swing_trading_backend.repository;

import com.example.swing_trading_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Optional: to find a user by email
}
