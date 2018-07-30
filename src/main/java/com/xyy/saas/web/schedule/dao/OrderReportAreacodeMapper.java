package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.OrderReportAreacode;

public interface OrderReportAreacodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReportAreacode record);

    int insertSelective(OrderReportAreacode record);

    OrderReportAreacode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReportAreacode record);

    int updateByPrimaryKey(OrderReportAreacode record);
}