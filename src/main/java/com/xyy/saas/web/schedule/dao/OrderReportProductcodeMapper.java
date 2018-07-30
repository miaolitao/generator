package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.OrderReportProductcode;

public interface OrderReportProductcodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReportProductcode record);

    int insertSelective(OrderReportProductcode record);

    OrderReportProductcode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderReportProductcode record);

    int updateByPrimaryKey(OrderReportProductcode record);
}