package com.gaochaojin.action;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaochaojin.entity.OrderEntity;
import com.gaochaojin.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 17:35 2020/1/15
 */
@Component("annotatedConsumer")
public class ServiceConsumer {

    @Reference
    private OrderService orderService;

    public OrderEntity getDetail(String id){
        return orderService.getDetail(id);
    }
}
