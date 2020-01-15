package com.gaochaojin;

import com.alibaba.fastjson.JSON;
import com.gaochaojin.entity.OrderEntity;
import com.gaochaojin.service.OrderService;
import com.gaochaojin.service.OrderServiceImpl;
import com.gaochaojin.utils.InvokeUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 14:49 2020/1/15
 */
public class Provider {

    @Configuration
    static class ProviderConfiguration {

        @Bean
        public OrderService orderService() {
            return new OrderServiceImpl();
        }
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        ctx.start();

        System.out.println("==========spring启动成功============");

        OrderService orderService = (OrderService) ctx.getBean("orderService");
        OrderEntity entity = orderService.getDetail("1");
        System.out.println("测试orderService.getDetail调用功能，调用结果：" + JSON.toJSONString(entity));

        System.out.println("===================================");

        Map<String, String> info = new HashMap();
        info.put("target", "orderService");
        info.put("methodName", "getDetail");
        info.put("arg", "1");
        Object result = InvokeUtils.invoke(info, ctx);
        System.out.println("测试InvokeUtils.invoke调用功能，调用结果：" + JSON.toJSONString(result));

    }

}
