package com.petropub.bo;

/**
 * 用户类
 * @author zhangxichuan
 *
 */
public class User {
    
    private Integer id;
    
    private String name;
    
    private String password;
    
    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.password + ", " + this.role; 
    }

}
