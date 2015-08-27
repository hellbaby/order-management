package com.petropub.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.petropub.bo.User;


public interface UserDao {
    
    @Transactional
    void insert(User user);
    
    User findById(int id);
    
    List<User> findByColumn(String key, Object value);

    @Transactional
    void update(User user);
    
}
