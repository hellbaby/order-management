package com.petropub.dao.impl;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petropub.bo.Order;
import com.petropub.dao.OrderDao;

@Repository
public class OrderDaoImpl implements OrderDao {
    
    @Autowired
    GenericDao<Order> genericDao;

    @Override
    public void insert(Order order) {
        try {
            genericDao.insert(order, "order");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Order findById(Long id) {
        return genericDao.findById(id, Order.class, "order");
    }
    
    @Override
    public List<Order> findByColumn(String key, Object value) {
        Entry<String, Object> column = new AbstractMap.SimpleEntry<String, Object>(key, value);
        return genericDao.findByColumn(column, Order.class, "order");
    }

}
