package com.gaochaojin.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.gaochaojin.entity.OrderEntity;



/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:44 2020/1/15
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderEntity getDetail(String id) {
        System.out.println(super.getClass().getName() + "被调用一次：" + System.currentTimeMillis());
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId("O0001");
        orderEntity.setMoney(1000);
        orderEntity.setUserId("U0001");
        return orderEntity;
    }
}
