package com.example.ivy.dao;

import com.example.ivy.entity.User;

import java.util.List;

public interface IBaseDao {
    void add(User user);

    void delete(User user);

    List<User> findAll();

    void update(User user);
}
