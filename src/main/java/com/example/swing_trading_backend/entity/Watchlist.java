package com.example.swing_trading_backend.entity;

import jakarta.persistence.*;

//stock_symbol = tikcer
@Entity
@Table(name = "watchlist")
public class Watchlist
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id for a watchlist
    private Long id;

}
