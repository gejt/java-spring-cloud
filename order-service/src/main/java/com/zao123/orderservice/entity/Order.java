package com.zao123.orderservice.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_order
 * @author 
 */
@Data
public class Order implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}