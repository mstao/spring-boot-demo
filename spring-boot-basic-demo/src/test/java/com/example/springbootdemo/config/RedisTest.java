package com.example.springbootdemo.config;

import com.example.springbootdemo.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 20:21 2017/11/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("aa", "aa-v");
        Assert.assertEquals("aa-v", stringRedisTemplate.opsForValue().get("aa"));
    }

    @Test
    public void testObj() throws InterruptedException {
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        ValueOperations<String, User> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("com.han", user);
        valueOperations.set("com.han.zz", user, 1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        boolean exists = redisTemplate.hasKey("com.han.zz");
        if(exists){
            System.out.println("exists is true");
        }else{
            System.out.println("exists is false");
        }
    }
}
