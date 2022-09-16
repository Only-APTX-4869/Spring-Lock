package com.example.spring_lock.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.spring_lock.mapper.StockMapper;
import com.example.spring_lock.pojo.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Service
public class StockService {
//    private Stock stock = new Stock();
    @Autowired
    private StockMapper stockMapper;
    public synchronized void reduce() {
        try {
            Stock stock = stockMapper.selectOne(
                    new QueryWrapper<Stock>().eq("product_Code","1001"));
            if (stock != null || stock.getCount() > 0){
                stock.setCount(stock.getCount() -1);
                stockMapper.updateById(stock);
            }
            System.out.println("剩余数量" + stock.getCount());
        } finally{

        }
    }
}
