package com.petropub.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.petropub.bo.User;

public class UserDaoTest {

    private UserDao userDao; 
    
    @Before
    public void init() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao = context.getBean("userDaoImpl", UserDao.class);
    }

    @Test
    public void testInsert() {
        Assert.notNull(userDao);
        User user = new User();
        user.setName("liang");
        user.setPassword("password9");
        userDao.insert(user);        
    }
    
    @Test
    public void testFindById() {
        Assert.notNull(userDao);
        User user = userDao.findById(2);
        System.out.println(user);
    }
    
    @Test
    public void testFindByColumn() {
        Assert.notNull(userDao);
        List<User> list = userDao.findByColumn("name", "zhang");
        System.out.println(list.get(0));
    }
}
