package com.example.swing_trading_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                        "https://h58l.github.io",
                        "https://h58l.github.io/",
                        "https://h58l.github.io/*",
                        "http://localhost:3000", 
                        "https://h58l.github.io/Swing-Trading_Frontend/",
                        "https://h58l.github.io/Swing-Trading_Frontend"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true); // Important for Redis sessions or cookies
    }
}
