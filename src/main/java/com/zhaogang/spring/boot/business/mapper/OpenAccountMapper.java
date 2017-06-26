package com.zhaogang.spring.boot.business.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhaogang.spring.boot.business.model.OpenAccount;

public interface OpenAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenAccount record);

    int insertSelective(OpenAccount record);

    OpenAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpenAccount record);

    int updateByPrimaryKey(OpenAccount record);
    
    OpenAccount queryByParams(@Param("map")Map<String, Object> map);
}