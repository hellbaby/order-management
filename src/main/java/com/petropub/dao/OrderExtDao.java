package com.petropub.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.petropub.bo.OrderExt;


public interface OrderExtDao {
    
    @Transactional
    void insert(OrderExt orderExt);
    
    OrderExt findById(Long id);
    
    @Transactional
    void update(OrderExt orderExt);

    List<OrderExt> findByColumn(String key, Object value);

}
