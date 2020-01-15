package com.gaochaojin.service;

import com.gaochaojin.entity.UserEntity;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:30 2020/1/15
 */
public interface UserService {

    UserEntity getDetail(String id);
}
