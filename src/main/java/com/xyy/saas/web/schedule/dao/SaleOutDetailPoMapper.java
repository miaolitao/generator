package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.SaleOutDetailPo;

public interface SaleOutDetailPoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SaleOutDetailPo record);

    int insertSelective(SaleOutDetailPo record);

    SaleOutDetailPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SaleOutDetailPo record);

    int updateByPrimaryKey(SaleOutDetailPo record);
}