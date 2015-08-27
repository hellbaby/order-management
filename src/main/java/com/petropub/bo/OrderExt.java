package com.petropub.bo;

import java.util.Date;

public class OrderExt {

    private Long id;
    
    /** 业务员 */
    private String salesman;

    /** 类型 0:社内; 1:石油; 2:社外; 3:内部 */
    private Integer type;
    
    /** 客户姓名 */
    private String customerName;
    
    /** 客户电话 */
    private String customerTel;
    
    /** 客户单位 */
    private String customerOrg;
    
    /** 开本 */
    private Integer format;
    
    /** 总册数 */
    private Integer amount;
    
    /** 印品名称 */
    private String prodName;
    
    /** 制作要求 */
    private String prodDemand;
    
    /** 印刷要求 */
    private String prIntegerDemand;
    
    /** 用纸要求 */
    private String paperDemand;
    
    /** 装订要求 */
    private String bindingDemand;
    
    /** 备注 */
    private String prodRemark;
    
    /** A4彩色P数 */
    private Integer colorAmount;
    
    /** A4黑白P数 */
    private Integer blackWhiteAmount;
    
    /** 胶订册数 */
    private Integer jiaodingAmount;
    
    /** 骑马订册数 */
    private Integer qimadingAmount;
    
    /** 操作员姓名 */
    private String operatorName;
    
    
    /** 制作费 */
    private Integer prodPrice;
    
    /** 制作彩色价格 */
    private Integer prodColorPrice;
    
    /** 制作彩色数量 */
    private Integer prodColorAmount;
    
    /** 制作黑白价格 */
    private Integer prodBlackWhitePrice;
    
    /** 制作黑白数量 */
    private Integer prodBlackWhiteAmount;
    
    /** 其他价格 */
    private Integer otherPrice1;
    
    /** 其他数量 */
    private Integer otherAmount1;
    
    /** 其他价格 */
    private Integer otherPrice2;
    
    /** 其他数量 */
    private Integer otherAmount2;
    
    /** 增减项 */
    private Integer attachPrice;
    
    /** 结算备注 */
    private String accountRemark;
    
    /** 审核人 */
    private String auditor;
    
    /** 总费用 */
    private String finalPrice;
    
    /** 结款情况, 0:已开未结; 1:已开已结 */
    private Integer settleState;
    
    /** 结款日期 */
    private Date settleDate;
    
    /************  送货信息 *************/
    /** 联系人 */
    private String deliverName;
    
    /** 联系电话 */
    private String deliverTel;
    
    /** 送货地址 */
    private String deliverAddr;
    
    /** 送货备注 */
    private String deliverRemark;
    
    /***************** getters and setters **************/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerOrg() {
        return customerOrg;
    }

    public void setCustomerOrg(String customerOrg) {
        this.customerOrg = customerOrg;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDemand() {
        return prodDemand;
    }

    public void setProdDemand(String prodDemand) {
        this.prodDemand = prodDemand;
    }

    public String getPrIntegerDemand() {
        return prIntegerDemand;
    }

    public void setPrIntegerDemand(String prIntegerDemand) {
        this.prIntegerDemand = prIntegerDemand;
    }

    public String getPaperDemand() {
        return paperDemand;
    }

    public void setPaperDemand(String paperDemand) {
        this.paperDemand = paperDemand;
    }

    public String getBindingDemand() {
        return bindingDemand;
    }

    public void setBindingDemand(String bindingDemand) {
        this.bindingDemand = bindingDemand;
    }

    public String getProdRemark() {
        return prodRemark;
    }

    public void setProdRemark(String prodRemark) {
        this.prodRemark = prodRemark;
    }

    public Integer getColorAmount() {
        return colorAmount;
    }

    public void setColorAmount(Integer colorAmount) {
        this.colorAmount = colorAmount;
    }

    public Integer getBlackWhiteAmount() {
        return blackWhiteAmount;
    }

    public void setBlackWhiteAmount(Integer blackWhiteAmount) {
        this.blackWhiteAmount = blackWhiteAmount;
    }

    public Integer getJiaodingAmount() {
        return jiaodingAmount;
    }

    public void setJiaodingAmount(Integer jiaodingAmount) {
        this.jiaodingAmount = jiaodingAmount;
    }

    public Integer getQimadingAmount() {
        return qimadingAmount;
    }

    public void setQimadingAmount(Integer qimadingAmount) {
        this.qimadingAmount = qimadingAmount;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Integer getProdColorPrice() {
        return prodColorPrice;
    }

    public void setProdColorPrice(Integer prodColorPrice) {
        this.prodColorPrice = prodColorPrice;
    }

    public Integer getProdColorAmount() {
        return prodColorAmount;
    }

    public void setProdColorAmount(Integer prodColorAmount) {
        this.prodColorAmount = prodColorAmount;
    }

    public Integer getProdBlackWhitePrice() {
        return prodBlackWhitePrice;
    }

    public void setProdBlackWhitePrice(Integer prodBlackWhitePrice) {
        this.prodBlackWhitePrice = prodBlackWhitePrice;
    }
    
    public Integer getProdBlackWhiteAmount() {
        return this.prodBlackWhiteAmount;
    }
    
    public void setProdBlackWhiteAmount(Integer prodBlackWhiteAmount) {
        this.prodBlackWhiteAmount = prodBlackWhiteAmount;
    }

    public Integer getOtherPrice1() {
        return otherPrice1;
    }

    public void setOtherPrice1(Integer otherPrice1) {
        this.otherPrice1 = otherPrice1;
    }

    public Integer getOtherAmount1() {
        return otherAmount1;
    }

    public void setOtherAmount1(Integer otherAmount1) {
        this.otherAmount1 = otherAmount1;
    }

    public Integer getOtherPrice2() {
        return otherPrice2;
    }

    public void setOtherPrice2(Integer otherPrice2) {
        this.otherPrice2 = otherPrice2;
    }

    public Integer getOtherAmount2() {
        return otherAmount2;
    }

    public void setOtherAmount2(Integer otherAmount2) {
        this.otherAmount2 = otherAmount2;
    }

    public Integer getAttachPrice() {
        return attachPrice;
    }

    public void setAttachPrice(Integer attachPrice) {
        this.attachPrice = attachPrice;
    }

    public String getAccountRemark() {
        return accountRemark;
    }

    public void setAccountRemark(String accountRemark) {
        this.accountRemark = accountRemark;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Integer getSettleState() {
        return settleState;
    }

    public void setSettleState(Integer settleState) {
        this.settleState = settleState;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }
    
    public String getDeliverName() {
        return deliverName;
    }

    public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }

    public String getDeliverTel() {
        return deliverTel;
    }

    public void setDeliverTel(String deliverTel) {
        this.deliverTel = deliverTel;
    }

    public String getDeliverAddr() {
        return deliverAddr;
    }

    public void setDeliverAddr(String deliverAddr) {
        this.deliverAddr = deliverAddr;
    }

    public String getDeliverRemark() {
        return deliverRemark;
    }

    public void setDeliverRemark(String deliverRemark) {
        this.deliverRemark = deliverRemark;
    }
}
