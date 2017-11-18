package com.example.srpingbootmybatisxml.repository.mybatis;

import com.example.srpingbootmybatisxml.entity.User;
import com.example.srpingbootmybatisxml.repository.UserRepository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 14:06 2017/11/18
 */
@Mapper
public interface UserMapper extends UserRepository {

}