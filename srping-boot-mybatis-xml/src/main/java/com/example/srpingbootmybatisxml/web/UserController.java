package com.example.srpingbootmybatisxml.web;

import com.example.srpingbootmybatisxml.entity.User;
import com.example.srpingbootmybatisxml.repository.mybatis.UserMapper;
import com.example.srpingbootmybatisxml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 21:18 2017/11/16
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=userService.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=userService.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        userService.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        userService.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}
