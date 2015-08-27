package com.petropub.bo;

import java.sql.Date;

/**
 * 订单类
 * @author zhangxichuan
 *
 */
public class Order {
    
    private Long id;
    
    private String sn;
    
    private Date date;
    
    private Integer state = 0;
    
    private Integer creator;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

}
