package com.gaochaojin.service;

import com.alibaba.fastjson.JSON;
import com.gaochaojin.entity.OrderEntity;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:43 2020/1/15
 */
public class InfoServiceImpl extends UnicastRemoteObject implements InfoService {

    public InfoServiceImpl() throws RemoteException{
        super();
    }
    @Override
    public Object sayHello(String name) throws RemoteException {
        return name+",你好，调通了！";
    }

    @Override
    public Object passInfo(Map<String, String> info) throws RemoteException {
        System.out.println("恭喜你，调通了，参数："+JSON.toJSONString(info));
        info.put("msg","你好，调通了！");
        return info;
    }
}
