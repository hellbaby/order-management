package com.petropub.dao.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.petropub.dao.GenericRowMapper;

@Repository
public class GenericDao<T> {

    @Autowired
    protected DataSource dataSource;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    public void insert(T bean, String tableName) throws Exception {
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder sql = new StringBuilder("INSERT INTO `" + tableName + "` (");
        List<Object> values = new ArrayList<Object>(fields.length);
        for (Field field : fields) {
            String fieldName = field.getName();
            String getter = ClassUtil.generateGetter(fieldName);
            Object value = clazz.getDeclaredMethod(getter).invoke(bean);
            if ("id".equals(fieldName) && value == null) { // 主键为空，则不拼接sql，由db生成
                continue;
            } else {
                values.add(value);
            }
            sql.append("`" + fieldName + "`").append(",");
        }
        sql.deleteCharAt(sql.length() - 1).append(") VALUES (");
        for (int i = 0; i < values.size() - 1; i++) {
            sql.append("?,");
        }
        sql.append("?)");
        jdbcTemplate.update(sql.toString(), values.toArray());
    }

    

    public T findById(Number id, Class<?> clazz, String tableName) {
        String sql = "select * from `" + tableName + "` where id = ?";
        T bean = jdbcTemplate.queryForObject(sql, new Object[] { id }, new GenericRowMapper<T>(clazz));
        return bean;
    }

    @SuppressWarnings("unchecked")
    public List<T> findByColumn(Entry<String, Object> column, Class<?> clazz, String tableName) {
        String sql = "select * from `" + tableName + "` where " + column.getKey() + "=?";
        List<Map<String, Object>> resultMapList = jdbcTemplate.queryForList(sql, column.getValue());
        List<T> results = new ArrayList<T>(resultMapList.size());
        for (Map<String, Object> resultMap : resultMapList) {
            try {
                T bean = (T) clazz.newInstance();
                for (String key : resultMap.keySet()) {
                    Object value = resultMap.get(key);
                    String setter = ClassUtil.generateSetter(key);
                    clazz.getMethod(setter, resultMap.get(key).getClass()).invoke(bean, value);
                }
                results.add(bean);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        return results;
    }

    

    public void deleteById(Number id, String tableName) {
        String sql = "delete from `" + tableName + "` where id = ?";
        jdbcTemplate.execute(sql);
    }

    public void update(T bean, String tableName) throws Exception {
        Class<?> clazz = bean.getClass();
        Field[] fields = clazz.getDeclaredFields();
        StringBuilder sql = new StringBuilder("UPDATE `" + tableName + "` SET ");
        List<Object> values = new ArrayList<Object>(fields.length);
        Object id = null;
        for (Field field : fields) {
            String fieldName = field.getName();
            String getter = ClassUtil.generateGetter(fieldName);
            Object value = clazz.getDeclaredMethod(getter).invoke(bean);
            if ("id".equals(fieldName)) { // 主键为空，则不拼接sql，由db生成
                if (value != null) {
                    id = value;
                    continue;
                } else {
                    return;
                }
            }
            sql.append("`" + fieldName + "`").append("=?,");
            values.add(value);
        }
        sql.deleteCharAt(sql.length() - 1).append(" WHERE id=?");
        values.add(id);
        jdbcTemplate.update(sql.toString(), values.toArray());
    }
    
}
