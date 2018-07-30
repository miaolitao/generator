package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.OrderReportMerchantcode;

public interface OrderReportMerchantcodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReportMerchantcode record);

    int insertSelective(OrderReportMerchantcode record);

    OrderReportMerchantcode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReportMerchantcode record);

    int updateByPrimaryKey(OrderReportMerchantcode record);
}