package com.example.ivy.dao.impl;

import com.example.ivy.dao.IBaseDao;
import com.example.ivy.entity.User;
import com.example.ivy.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class IBaseDaoImpl implements IBaseDao {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void add(User user) {
        redisUtil.add(user);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }
}
