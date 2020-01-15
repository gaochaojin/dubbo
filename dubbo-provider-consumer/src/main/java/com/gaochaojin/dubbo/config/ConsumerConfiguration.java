package com.gaochaojin.dubbo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 18:17 2020/1/15
 */
@Configuration
@EnableDubbo(scanBasePackages = {"com.gaochaojin.service"})
@ComponentScan(value = {"com.gaochaojin.action"})
@PropertySource("classpath:dubbo-consumer.properties")
public class ConsumerConfiguration {
}
