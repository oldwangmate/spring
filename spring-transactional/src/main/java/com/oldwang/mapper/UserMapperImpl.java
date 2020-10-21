package com.oldwang.mapper;

import com.oldwang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        User user = new User(8,"你好","wwww");
        mapper.insertUser(user);
        mapper.delUser(8);
        return mapper.getUser();
    }

    //插入
    @Override
    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }
    //删除
    @Override
    public int delUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUser(id);
    }
}
