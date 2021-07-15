package com.rj.gd.streams.uc1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Random;

@Log4j2
@Component
public class LookupService {

    Random random = new Random();

    @Cacheable(cacheNames = "CCO")
    public TickerInfo getData(String ticker) {
        log.info("cache missed, get it from database key= {}" , ticker);
        float open = random.nextFloat() * 10;
        float close = open + random.nextFloat() - random.nextFloat();
        return new TickerInfo(ticker, open, close);
    }

    @Data
    @AllArgsConstructor
    public static class TickerInfo {
        String ticker;
        float open, close;
    }
}
