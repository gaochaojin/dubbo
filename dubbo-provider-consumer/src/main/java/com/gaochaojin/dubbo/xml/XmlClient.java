package com.gaochaojin.dubbo.xml;

import com.gaochaojin.entity.OrderEntity;
import com.gaochaojin.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 16:35 2020/1/15
 */
public class XmlClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/dubbo-client.xml");
        ctx.start();

        System.out.println("=====dubbo启动成功=====");

        OrderService orderService = (OrderService) ctx.getBean("orderService");

        OrderEntity detail = orderService.getDetail("1");
        System.out.println("echo result :"+detail.getMoney());
    }
}
