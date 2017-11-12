package com.example.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 20:36 2017/11/12
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class SessionConfig {
}
