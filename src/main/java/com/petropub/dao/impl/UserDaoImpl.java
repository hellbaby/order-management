package com.petropub.dao.impl;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petropub.bo.User;
import com.petropub.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
    
    @Autowired
    private GenericDao<User> baseDao;
    
    @Override
    public void insert(User user) {
        try {
            baseDao.insert(user, "user");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findById(int id) {
        return baseDao.findById(id, User.class, "user");
    }

    @Override
    public List<User> findByColumn(String key, Object value) {
        Entry<String, Object> column = new AbstractMap.SimpleEntry<String, Object>(key, value);
        return baseDao.findByColumn(column, User.class, "user");
    }
    
    @Override
    public void update(User user) {
        try {
            baseDao.update(user, "user");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
