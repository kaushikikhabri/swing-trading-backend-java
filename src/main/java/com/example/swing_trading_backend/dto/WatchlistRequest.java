//package com.example.swing_trading_backend.dto;
//
//public class WatchlistRequest {
//    private String ticker;
//
//    public WatchlistRequest() {
//    }
//    public String getTicker() {
//        return ticker;
//    }
//
//    public void setTicker(String ticker) {
//        this.ticker = ticker;
//    }
//}

package com.example.swing_trading_backend.dto;

import java.time.LocalDateTime;

public class WatchlistRequest {

    private Long id;
    private String ticker;
    private LocalDateTime createdAt;
    private String emailId;

    // Default constructor
    public WatchlistRequest() {}

    // Getter
    public String getTicker() {
        return ticker;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getEmailId() {
        System.out.println("hbdjwsk: " + emailId);
        return emailId;
    }

    public Long getId() {
        return id;
    }

    // Setter
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
