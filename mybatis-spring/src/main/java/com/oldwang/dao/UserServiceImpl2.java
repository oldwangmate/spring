package com.oldwang.dao;

import com.oldwang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class UserServiceImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUserList() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUserList();
    }

    public void addUser2(Map<String, Object> map) {

    }

    public List<User> getUserLike(String value) {
        return null;
    }

    public List<User> getUserLimit(Map<String, Integer> map) {
        return null;
    }
}
