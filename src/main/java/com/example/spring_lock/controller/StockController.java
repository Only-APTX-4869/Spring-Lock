package com.example.spring_lock.controller;

import com.example.spring_lock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("stock/reduce")
    public String reduce() {
        this.stockService.reduce();
        return "Hello reduce()" + LocalTime.now();
    }
}
