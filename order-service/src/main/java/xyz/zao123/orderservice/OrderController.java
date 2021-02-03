package xyz.zao123.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zao123.orderservice.entity.Order;
import xyz.zao123.orderservice.mapper.OrderMapper;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    OrderMapper orderMapper;

    @GetMapping("/")
    public Order listOrder() {
        return orderMapper.selectByPrimaryKey(1L);
    }

}
