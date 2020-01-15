package com.gaochaojin.dubbo.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.gaochaojin.service.OrderService;
import com.gaochaojin.service.OrderServiceImpl;

import java.io.IOException;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:29 2020/1/15
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServiceConfig<OrderService> config = new ServiceConfig<>();
        config.setApplication(new ApplicationConfig("dubbo-provider"));
        config.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        config.setProtocol(new ProtocolConfig("dubbo"));
        config.setInterface(OrderService.class);
        config.setRef(new OrderServiceImpl());
        config.export();

        System.out.println("======first-dubbo-provider is running======");
        System.in.read();
    }
}
