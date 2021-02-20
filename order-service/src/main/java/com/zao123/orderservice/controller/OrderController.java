package com.zao123.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zao123.orderservice.entity.Order;
import com.zao123.orderservice.service.OrderService;

import javax.annotation.Resource;

/**
 * @author gejt
 */
@RestController
public class OrderController {

    @Resource
    OrderService orderService;

    @GetMapping("/")
    public Order listOrder() {
        return orderService.getOrder(1L);
    }

}
