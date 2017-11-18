package com.example.srpingbootmybatisxml.entity;

import com.example.srpingbootmybatisxml.enums.UserSexEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 23:53 2017/11/13
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2226708108679108824L;
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;

    public User() {
        super();
    }

    public User(String userName, String passWord, UserSexEnum userSex) {
        super();
        this.passWord = passWord;
        this.userName = userName;
        this.userSex = userSex;
    }
}
