package com.petropub.dao;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.petropub.bo.OrderExt;

public class GenericRowMapper<T> implements RowMapper<T> {

    /** 转换的目标对象 */
    private Class<?> clazz;
    
    public GenericRowMapper(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    @SuppressWarnings({ "unchecked" })
    public T mapRow(ResultSet rs, int i) throws SQLException {
        T entity = null;
        try {
            entity = (T) this.clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                String setter = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
//                System.out.println(setter + ", " + field.getType().getSimpleName());
//                String dbValue = ResultSet.class.getDeclaredMethod(name, parameterTypes)
//                Object o = rs.getObject(fieldName);
//                Class<?> fieldClazz = field.getType();
                Object dbValue = rs.getObject(fieldName);
                clazz.getDeclaredMethod(setter, field.getType()).invoke(entity, dbValue);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return entity;
    }
    
    public static void main(String[] args) {
        GenericRowMapper<OrderExt> mapper = new GenericRowMapper<OrderExt>(OrderExt.class);
        ResultSet rs = null;
        int i = 0; 
        try {
            mapper.mapRow(rs, i);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
