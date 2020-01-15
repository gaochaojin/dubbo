package com.gaochaojin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:25 2020/1/15
 */
@Data
public class ProductEntity implements Serializable {

    private String id;
    private long price;
    private String name;
    private int status;
}
