package com.gaochaojin;

import com.alibaba.fastjson.JSON;
import com.gaochaojin.entity.OrderEntity;
import com.gaochaojin.service.InfoService;
import com.gaochaojin.service.OrderService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:58 2020/1/15
 */
public class RmiClient {

    public static void main(String[] args) {
        InfoService infoService = null;
        try {
            // 取远程方法实现
            infoService = (InfoService) Naming.lookup(InfoService.RMI_URL);
            Object ret = infoService.sayHello("gaochaojin");
            System.out.println("测试远程调用功能infoService.sayHello，调用结果：" + JSON.toJSONString(ret));

            // 远程反射方法
            Map<String, String> info = new HashMap<>();
            info.put("target", "orderService");
            info.put("methodName", "getDetail");
            info.put("arg", "1");
            Object result = infoService.passInfo(info);
            System.out.println("测试远程调用功能，调用结果：" + JSON.toJSONString(result));

            // 静态代理方法
            OrderService service = getService(infoService);
            OrderEntity result2 = service.getDetail("1");
            System.out.println("测试远程调用功能，调用结果："+JSON.toJSONString(result2));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static OrderService getService(InfoService infoService){
        OrderService service = new OrderService() {
            @Override
            public OrderEntity getDetail(String id) {
                Map<String,String> info = new HashMap();
                //写死了反射的目标，静态代理
                info.put("target","orderService");//对象
                info.put("methodName","getDetail");//方法
                info.put("arg",id);//参数

                OrderEntity orderEntity = null;

                try {
                    orderEntity = (OrderEntity)infoService.passInfo(info);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                return orderEntity;
            }
        };
        return service;
    }
}
