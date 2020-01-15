package com.gaochaojin.service;

import com.gaochaojin.entity.OrderEntity;
import org.springframework.stereotype.Service;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:09 2020/1/15
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderEntity getDetail(String id) {
        System.out.println(super.getClass().getName() + "被调用一次" + System.currentTimeMillis());
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(id);
        orderEntity.setMoney(1000);
        orderEntity.setUserId("U0001");

        return orderEntity;
    }
}
