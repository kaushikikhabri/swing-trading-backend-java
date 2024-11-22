package com.example.swing_trading_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories(basePackages = "com.example.swing_trading_backend.redis_repository") // Adjust this path
public class SwingTradingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwingTradingBackendApplication.class, args);
		System.out.println("Hello World!");
	}
}
