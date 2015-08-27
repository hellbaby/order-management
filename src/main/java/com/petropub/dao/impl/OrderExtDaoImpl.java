package com.petropub.dao.impl;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petropub.bo.OrderExt;
import com.petropub.dao.OrderExtDao;

@Repository
public class OrderExtDaoImpl implements OrderExtDao {

    @Autowired
    private GenericDao<OrderExt> genericDao;

    @Override
    public void insert(OrderExt orderExt) {
        try {
            genericDao.insert(orderExt, "orderext");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public OrderExt findById(Long id) {
        return genericDao.findById(id, OrderExt.class, "orderext");
    }

    @Override
    public void update(OrderExt orderExt) {
        try {
            genericDao.update(orderExt, "orderext");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<OrderExt> findByColumn(String key, Object value) {
        Entry<String, Object> column = new AbstractMap.SimpleEntry<String, Object>(key, value);
        return genericDao.findByColumn(column, OrderExt.class, "orderext");
    }

}
