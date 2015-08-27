package com.petropub.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.petropub.bo.OrderExt;

public class OrderExtDaoTest {
    
    private OrderExtDao dao;
    
    @Before
    public void init() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = context.getBean("orderExtDaoImpl", OrderExtDao.class);
    }

    @Test
    public void testInsert() {
        OrderExt bean = new OrderExt();
        bean.setId(3L);
        bean.setType(2);
        bean.setCustomerName("customer2");
        bean.setSalesman("sale1");
        bean.setAmount(123);
        bean.setAccountRemark("测试一下");
        dao.insert(bean);
    }
    
    @Test
    public void findById() {
        OrderExt bean = dao.findById(3L);
        System.out.println(bean.getAccountRemark());
    }
    
    @Test
    public void testUpdateById() {
        OrderExt bean = new OrderExt();
        bean.setId(3L);
        bean.setType(2);
        bean.setCustomerName("customer2");
        bean.setSalesman("sale1");
        bean.setAmount(123);
        bean.setAccountRemark("继续测试下更新");
        dao.update(bean);
    }
}
