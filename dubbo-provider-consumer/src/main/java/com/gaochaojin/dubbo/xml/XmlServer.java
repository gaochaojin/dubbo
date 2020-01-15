package com.gaochaojin.dubbo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 15:50 2020/1/15
 */
public class XmlServer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/dubbo-server.xml");
        ctx.start();
        System.out.println("=======dubbo启动成功==========");

        // 保证服务一直开启
        synchronized (XmlServer.class){
            try {
                XmlServer.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
