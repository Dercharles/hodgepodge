package com.example.hodgepodge;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class HodgepodgeApplicationTests {
    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("01","测试数据");
        String s = redisTemplate.opsForValue().get("01");
        System.out.println(s);
        String s1 = redisTemplate.opsForValue().get("02");
        System.out.println(s1);
        redisTemplate.opsForValue().set("02","测试数据2",3, TimeUnit.MINUTES);
    }

}
