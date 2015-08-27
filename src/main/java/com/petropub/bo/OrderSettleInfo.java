package com.petropub.bo;

import java.util.Date;

public class OrderSettleInfo {
    
    /** 制作费 */
    private int prodPrice;
    
    /** 制作彩色价格 */
    private int prodColorPrice;
    
    /** 制作彩色数量 */
    private int prodColorAmount;
    
    /** 制作黑白价格 */
    private int prodBlackWhitePrice;
    
    /** 制作黑白数量 */
    private int prodBlackWhiteAmount;
    
    /** 其他价格 */
    private int otherPrice1;
    
    /** 其他数量 */
    private int otherAmount1;
    
    /** 其他价格 */
    private int otherPrice2;
    
    /** 其他数量 */
    private int otherAmount2;
    
    /** 增减项 */
    private int attachPrice;
    
    /** 结算备注 */
    private String accountRemark;
    
    /** 审核人 */
    private String auditor;
    
    /** 总费用 */
    private String finalPrice;
    
    /** 结款情况, 0:已开未结; 1:已开已结 */
    private int settleState;
    
    /** 结款日期 */
    private Date settleDate;
    
    public int getprodPrice() {
        return prodPrice;
    }

    public void setprodPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getprodColorPrice() {
        return prodColorPrice;
    }

    public void setprodColorPrice(int prodColorPrice) {
        this.prodColorPrice = prodColorPrice;
    }

    public int getprodColorAmount() {
        return prodColorAmount;
    }

    public void setprodColorAmount(int prodColorAmount) {
        this.prodColorAmount = prodColorAmount;
    }

    public int getprodBlackWhitePrice() {
        return prodBlackWhitePrice;
    }

    public void setBlackWhitePrice(int prodBlackWhitePrice) {
        this.prodBlackWhitePrice = prodBlackWhitePrice;
    }

    public int getProdBlackWhitePrice() {
        return prodBlackWhitePrice;
    }

    public void setProdBlackWhitePrice(int prodBlackWhitePrice) {
        this.prodBlackWhitePrice = prodBlackWhitePrice;
    }
    
    public void setProdBlackWhiteAmount(int prodBlackWhiteAmount) {
        this.prodBlackWhiteAmount = prodBlackWhiteAmount;
    }
    
    public int getProdBlackWhiteAmount() {
        return this.prodBlackWhiteAmount;
    }

    public int getOtherPrice1() {
        return otherPrice1;
    }

    public void setOtherPrice1(int otherPrice1) {
        this.otherPrice1 = otherPrice1;
    }

    public int getOtherAmount1() {
        return otherAmount1;
    }

    public void setOtherAmount1(int otherAmount1) {
        this.otherAmount1 = otherAmount1;
    }

    public int getOtherPrice2() {
        return otherPrice2;
    }

    public void setOtherPrice2(int otherPrice2) {
        this.otherPrice2 = otherPrice2;
    }

    public int getOtherAmount2() {
        return otherAmount2;
    }

    public void setOtherAmount2(int otherAmount2) {
        this.otherAmount2 = otherAmount2;
    }

    public int getAttachPrice() {
        return attachPrice;
    }

    public void setAttachPrice(int attachPrice) {
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

    public int getSettleState() {
        return settleState;
    }

    public void setSettleState(int settleState) {
        this.settleState = settleState;
    }

    public Date getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(Date settleDate) {
        this.settleDate = settleDate;
    }
    

}
