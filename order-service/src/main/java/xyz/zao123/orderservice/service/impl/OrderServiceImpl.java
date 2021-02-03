package xyz.zao123.orderservice.service.impl;

import org.springframework.stereotype.Service;
import xyz.zao123.orderservice.entity.Order;
import xyz.zao123.orderservice.mapper.OrderMapper;
import xyz.zao123.orderservice.service.OrderService;

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
