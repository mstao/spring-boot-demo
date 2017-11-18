package com.example.srpingbootmybatisxml.mapper;

import com.example.srpingbootmybatisxml.entity.User;
import com.example.srpingbootmybatisxml.enums.UserSexEnum;
import com.example.srpingbootmybatisxml.repository.mybatis.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 14:09 2017/11/18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aa", "a123456", UserSexEnum.MALE));
        userMapper.insert(new User("bb", "b123456", UserSexEnum.FEMALE));
        userMapper.insert(new User("cc", "b123456", UserSexEnum.FEMALE));

        Assert.assertEquals(3, userMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userMapper.getOne(3L);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(3L).getNickName())));
    }
}
