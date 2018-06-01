package com.example.demo.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {
    @Test
    public void contextLoads() {
    }
    @Autowired
    RedisDao redisDao;
    @Test
    public void testRedis() {
        redisDao.setKey("name", "zyt");
        redisDao.setKey("age", "4");
        assertTrue(redisDao.getValue("name").equals("zyt"));
        assertTrue(redisDao.getValue("age").equals("4"));
    }

}