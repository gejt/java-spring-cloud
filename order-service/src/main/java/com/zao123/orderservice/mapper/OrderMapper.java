package com.zao123.orderservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.zao123.orderservice.entity.Order;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}