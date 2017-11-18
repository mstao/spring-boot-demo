package com.han.springbootmybatisdemo.mapper;

import com.han.springbootmybatisdemo.entity.User;
import com.han.springbootmybatisdemo.enums.UserSexEnum;
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
 * @Date: Created in 20:47 2017/11/15
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

        Assert.assertEquals(3, userMapper.findAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.findAll();
        System.out.println(users.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        User user = userMapper.findOne(3L);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.findOne(3L).getNickName())));
    }
}