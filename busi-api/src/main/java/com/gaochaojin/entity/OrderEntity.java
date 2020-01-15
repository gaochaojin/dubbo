package com.gaochaojin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:25 2020/1/15
 */
@Data
public class OrderEntity implements Serializable {

    private String id;
    private long money;
    private String userId;
    private int status;
    private List<ProductEntity> productlist = new ArrayList<>();
}
