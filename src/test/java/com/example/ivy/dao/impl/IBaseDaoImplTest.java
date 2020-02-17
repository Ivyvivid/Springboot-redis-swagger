package com.example.ivy.dao.impl;

import com.example.ivy.entity.User;
import com.example.ivy.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IBaseDaoImplTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void add() {
        User user = new User();
        user.setName("7宝");
        user.setId(7);
        user.setPassword("123");
        redisUtil.add(user);

        List<User> users = new ArrayList<User>();
        users = redisUtil.findAll();
        for (User u :
                users) {
            System.out.println(u.toString());
        }
    }
}