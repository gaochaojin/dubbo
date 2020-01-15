package com.gaochaojin.service;

import com.gaochaojin.entity.OrderEntity;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:31 2020/1/15
 */
public interface OrderService {

    OrderEntity getDetail(String id);
}
