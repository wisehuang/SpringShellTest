package com.springshelltest.service;

import com.springshelltest.dao.UserDao;
import com.springshelltest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public String get(int id) {
        var user = userDao.findById(id).orElse(new User());

        return user.toString();
    }
}
