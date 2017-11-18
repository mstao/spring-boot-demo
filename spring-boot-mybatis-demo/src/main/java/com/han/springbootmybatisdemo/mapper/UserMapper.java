package com.han.springbootmybatisdemo.mapper;

import com.han.springbootmybatisdemo.entity.User;
import com.han.springbootmybatisdemo.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 22:35 2017/11/14
 */
@Mapper
public interface UserMapper {

    @Select(
            "SELECT * FROM users"
    )
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> findAll();

    @Select(
            "SELECT * FROM users WHERE id = #{id}"
    )
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    User findOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
