package com.example.srpingbootmybatisxml.service;

import com.example.srpingbootmybatisxml.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 20:58 2017/11/18
 */
public interface UserService {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
