package com.petropub.dao.impl;


public class ClassUtil {
    
    private static final String SET = "set";
    
    private static final String GET = "get";
    
    public static String generateSetter(String key) {
        return SET + key.substring(0, 1).toUpperCase() + key.substring(1);
    }
    
    public static String generateGetter(String fieldName) {
        return GET + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
    
    

}
