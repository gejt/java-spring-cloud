package com.zao123.orderservice.service.impl;

import com.zao123.orderservice.mapper.OrderMapper;
import com.zao123.orderservice.service.OrderService;
import org.springframework.stereotype.Service;
import com.zao123.orderservice.entity.Order;

import javax.annotation.Resource;

/**
 * @author gejt
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;

    @Override
    public Order getOrder(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
