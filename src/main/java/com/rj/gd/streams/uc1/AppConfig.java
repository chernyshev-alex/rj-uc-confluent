package com.rj.gd.streams.uc1;

import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Log4j2
@EnableCaching
@Configuration
public class AppConfig {

    @Value("${spring.cache.maxSize}")
    Integer cacheMaxSize;
    @Value("${spring.cache.expireInSec}")
    Integer expireInSeconds ;

    // Cache configurations
    @Bean
    public Caffeine caffeineConfig() {
        return Caffeine.newBuilder().maximumSize(cacheMaxSize)
                .expireAfterWrite(expireInSeconds, TimeUnit.SECONDS);
    }

    @Bean
    public CacheManager cacheManager(Caffeine caffeine) {
        CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
        caffeineCacheManager.setCaffeine(caffeine);
        return caffeineCacheManager;
    }
}
