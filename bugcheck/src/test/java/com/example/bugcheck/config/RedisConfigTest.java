package com.example.bugcheck.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import static org.junit.jupiter.api.Assertions.*;

class RedisConfigTest {

    RedisConfigTest redisConfigTest;
    @BeforeEach
    void setUp() {
        redisConfigTest =new RedisConfigTest();
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
        redisConfigTest =null;
    }

    @Test
    void redisTemplate() {

    }
}