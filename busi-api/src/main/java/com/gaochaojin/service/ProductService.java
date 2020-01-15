package com.gaochaojin.service;

import com.gaochaojin.entity.ProductEntity;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:30 2020/1/15
 */
public interface ProductService {

    ProductEntity getDetail(String id);
}
