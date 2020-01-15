package com.gaochaojin.dubbo.config;

import com.gaochaojin.action.ServiceConsumer;
import com.gaochaojin.dubbo.annotation.ConsumerAnnotation;
import com.gaochaojin.entity.OrderEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 17:36 2020/1/15
 */
public class Consumer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();

        System.out.println("======dubbo启动成功====");

        ServiceConsumer serviceConsumer = context.getBean(ServiceConsumer.class);
        OrderEntity detail = serviceConsumer.getDetail("1");
        System.out.println("result:" + detail.getMoney());
    }
}
