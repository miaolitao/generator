package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.BusinessStatementOrder;

public interface BusinessStatementOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusinessStatementOrder record);

    int insertSelective(BusinessStatementOrder record);

    BusinessStatementOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BusinessStatementOrder record);

    int updateByPrimaryKey(BusinessStatementOrder record);
}