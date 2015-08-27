package com.petropub.service;

import com.petropub.bo.User;

public interface UserService {

    public int add(User user);
    
    public void update(User user);
    
    public int validate(String user, String password);
    
}
