package com.springboot.mapper;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getAllUsers();
}
