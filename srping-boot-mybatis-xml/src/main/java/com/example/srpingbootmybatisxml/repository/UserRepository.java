package com.example.srpingbootmybatisxml.repository;

import com.example.srpingbootmybatisxml.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 20:56 2017/11/18
 */
public interface UserRepository {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
