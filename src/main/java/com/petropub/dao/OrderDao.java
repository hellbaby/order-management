package com.petropub.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.petropub.bo.Order;

@Transactional
public interface OrderDao {
    
    void insert(Order order);
    
    Order findById(Long id);

    List<Order> findByColumn(String key, Object value);

}
