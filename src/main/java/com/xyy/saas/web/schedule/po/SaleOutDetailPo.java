package com.xyy.saas.web.schedule.po;

import java.math.BigDecimal;

public class SaleOutDetailPo {
    private Long id;

    private Long saleOutId;

    private String businessId;

    private String drugNumber;

    private String drugSpecification;

    private String unitName;

    private String manufacturerName;

    private String approvalNumber;

    private String producingArea;

    private BigDecimal receiveNumber;

    private BigDecimal confirmNumber;

    private Integer pullYn;

    private BigDecimal taxPrice;

    private BigDecimal totalTaxAmount;

    private String batchNumber;

    private String producedDate;

    private String expiredDate;

    private String drugStoreId;

    private Long productId;

    private String productNumber;

    private String productName;

    private BigDecimal discountAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSaleOutId() {
        return saleOutId;
    }

    public void setSaleOutId(Long saleOutId) {
        this.saleOutId = saleOutId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber == null ? null : drugNumber.trim();
    }

    public String getDrugSpecification() {
        return drugSpecification;
    }

    public void setDrugSpecification(String drugSpecification) {
        this.drugSpecification = drugSpecification == null ? null : drugSpecification.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName == null ? null : manufacturerName.trim();
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber == null ? null : approvalNumber.trim();
    }

    public String getProducingArea() {
        return producingArea;
    }

    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea == null ? null : producingArea.trim();
    }

    public BigDecimal getReceiveNumber() {
        return receiveNumber;
    }

    public void setReceiveNumber(BigDecimal receiveNumber) {
        this.receiveNumber = receiveNumber;
    }

    public BigDecimal getConfirmNumber() {
        return confirmNumber;
    }

    public void setConfirmNumber(BigDecimal confirmNumber) {
        this.confirmNumber = confirmNumber;
    }

    public Integer getPullYn() {
        return pullYn;
    }

    public void setPullYn(Integer pullYn) {
        this.pullYn = pullYn;
    }

    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }

    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(String producedDate) {
        this.producedDate = producedDate == null ? null : producedDate.trim();
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate == null ? null : expiredDate.trim();
    }

    public String getDrugStoreId() {
        return drugStoreId;
    }

    public void setDrugStoreId(String drugStoreId) {
        this.drugStoreId = drugStoreId == null ? null : drugStoreId.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }
}