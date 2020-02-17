package com.example.ivy.service;

import com.example.ivy.dao.IBaseDao;
import com.example.ivy.dao.impl.IBaseDaoImpl;
import com.example.ivy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public IBaseDao baseDao;

    public void add(User user){
        baseDao.add(user);
    }
}
