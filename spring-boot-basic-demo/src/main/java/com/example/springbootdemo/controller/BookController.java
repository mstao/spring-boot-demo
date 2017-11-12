package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:40 2017/11/11
 */
@RestController
public class BookController {
    @Autowired
    private Book book;

    @RequestMapping("/book")
    public String book() {
        return "Hello Spring Boot! The BookName is "+book.getName()+";and Book Author is "+book.getAuthor()+";and Book price is "+book.getPrice();
    }
}
