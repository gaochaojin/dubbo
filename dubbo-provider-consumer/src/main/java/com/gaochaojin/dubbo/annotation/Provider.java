package com.gaochaojin.dubbo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 17:36 2020/1/15
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderAnnotation.class);
        context.start();

        System.out.println("=======dubbo启动成功======");

        System.in.read();

    }
}
