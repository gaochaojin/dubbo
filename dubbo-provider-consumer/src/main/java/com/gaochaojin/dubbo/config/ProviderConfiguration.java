package com.gaochaojin.dubbo.config;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
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
@PropertySource("classpath:dubbo-provider.properties")
public class ProviderConfiguration {
}
