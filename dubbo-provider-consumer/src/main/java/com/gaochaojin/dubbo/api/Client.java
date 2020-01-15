package com.gaochaojin.dubbo.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.gaochaojin.entity.OrderEntity;
import com.gaochaojin.service.OrderService;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:30 2020/1/15
 */
public class Client {

    public static void main(String[] args) {
        ReferenceConfig<OrderService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("dubbo-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        reference.setInterface(OrderService.class);
        OrderService orderService = reference.get();

        OrderEntity detail = orderService.getDetail("1");
        System.out.println("result:"+detail.getMoney());
    }
}
