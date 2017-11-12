package com.example.springbootdemo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:38 2017/11/11
 */
@Component
@PropertySource("classpath:book.properties")
@ConfigurationProperties(prefix = "book")
@Data
public class Book {
    private String name;
    private String author;
    private String price;

}
