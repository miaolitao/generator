package com.xyy.saas.web.schedule.dao;

import com.xyy.saas.web.schedule.po.MltTest;

public interface MltTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MltTest record);

    int insertSelective(MltTest record);

    MltTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MltTest record);

    int updateByPrimaryKey(MltTest record);
}