package com.petropub.dao;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.petropub.bo.Order;

public class OrderDaoTest {

    private OrderDao orderDao; 
    
    @Before
    public void init() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        orderDao = context.getBean("orderDaoImpl", OrderDao.class);
    }

    @Test
    public void testInsert() {
        Assert.notNull(orderDao);
        Order order = new Order();
        order.setSn("123-333");
        order.setDate(new Date(System.currentTimeMillis()));
        order.setCreator(123);
        order.setState(2);
        orderDao.insert(order);        
    }
    
    @Test
    public void testFindById() {
        Assert.notNull(orderDao);
        Order order = orderDao.findById(2L);
        System.out.println(order);
    }
    
    @Test
    public void testFindByColumn() {
        Assert.notNull(orderDao);
        System.out.println(orderDao.findByColumn("sn", "123-333").get(0));
        
    }
    
}
