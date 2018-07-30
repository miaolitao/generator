package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.OrderReportMerchant;

public interface OrderReportMerchantMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReportMerchant record);

    int insertSelective(OrderReportMerchant record);

    OrderReportMerchant selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReportMerchant record);

    int updateByPrimaryKey(OrderReportMerchant record);
}