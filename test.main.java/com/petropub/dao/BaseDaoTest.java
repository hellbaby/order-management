package com.petropub.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.petropub.bo.User;
import com.petropub.dao.impl.GenericDao;

public class BaseDaoTest {

    private GenericDao<User> baseDao;
    
    @Before
    public void init() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        baseDao = context.getBean("baseDaoImpl", GenericDao.class);
    }

    @Test
    public void testInsert() {
        Assert.notNull(baseDao);
        User user = new User();
        user.setName("lee");
        user.setPassword("password5");
        try {
            baseDao.insert(user, "user");
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    @Test
    public void testFindById() {
        Assert.notNull(baseDao);
//        User user = userDao.findById(2);
        User user = baseDao.findById(2, User.class, "user");
        System.out.println(user);
    }

}
