package com.example.springbootdemo.domain;

import com.example.springbootdemo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 14:40 2017/11/12
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
}
