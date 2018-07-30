package com.xyy.saas.web.schedule.po;

public class OrderReportAreacode {
    private Long id;

    private String createTime;

    private String areaCode;

    private Long orderAmount;

    private Long amountPaid;

    private Long orderNumber;

    private Long firstOrderNumber;

    private Long validOrders;

    private Long newRefundOrder;

    private Long actualRefundAmount;

    private Long skuNumber;

    private Long exclusiveSales;

    private Long bookedGold;

    private String branchCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Long amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getFirstOrderNumber() {
        return firstOrderNumber;
    }

    public void setFirstOrderNumber(Long firstOrderNumber) {
        this.firstOrderNumber = firstOrderNumber;
    }

    public Long getValidOrders() {
        return validOrders;
    }

    public void setValidOrders(Long validOrders) {
        this.validOrders = validOrders;
    }

    public Long getNewRefundOrder() {
        return newRefundOrder;
    }

    public void setNewRefundOrder(Long newRefundOrder) {
        this.newRefundOrder = newRefundOrder;
    }

    public Long getActualRefundAmount() {
        return actualRefundAmount;
    }

    public void setActualRefundAmount(Long actualRefundAmount) {
        this.actualRefundAmount = actualRefundAmount;
    }

    public Long getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(Long skuNumber) {
        this.skuNumber = skuNumber;
    }

    public Long getExclusiveSales() {
        return exclusiveSales;
    }

    public void setExclusiveSales(Long exclusiveSales) {
        this.exclusiveSales = exclusiveSales;
    }

    public Long getBookedGold() {
        return bookedGold;
    }

    public void setBookedGold(Long bookedGold) {
        this.bookedGold = bookedGold;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
    }
}