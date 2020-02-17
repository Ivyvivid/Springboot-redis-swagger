package com.example.ivy.util;

import com.example.ivy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    public void add(User user) {
        redisTemplate.opsForValue().set(user.getName(),user);
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        Set<String> keys = redisTemplate.keys("*");
        for (String key :
                keys) {
            User user = (User) redisTemplate.opsForValue().get(key);
            list.add(user);
        }
        return list;
    }
}
