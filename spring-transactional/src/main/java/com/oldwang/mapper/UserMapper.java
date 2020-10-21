package com.oldwang.mapper;

import com.oldwang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<User> getUser();

    public int insertUser(User user);

    public int delUser(@Param("id") int id);
}
