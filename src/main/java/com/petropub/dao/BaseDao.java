package com.petropub.dao;


public interface BaseDao<T> {
    
//    void insert(T user);
    
    T findById(int id);

}
