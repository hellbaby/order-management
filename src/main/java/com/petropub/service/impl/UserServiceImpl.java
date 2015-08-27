package com.petropub.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.petropub.bo.User;
import com.petropub.dao.UserDao;
import com.petropub.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public int add(User user) {
//        if (CommonUtils.user.getName() )
        
        return 0;
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        userDao.update(user);        
    }

    @Override
    public int validate(String user, String password) {
        List<User> userList = userDao.findByColumn("name", user);
        // TODO Auto-generated method stub
        return 0;
    }

    
}
