package com.gaochaojin;

import com.gaochaojin.service.InfoService;
import com.gaochaojin.service.InfoServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:54 2020/1/15
 */
public class RmiServer {

    public static void main(String[] args) {
        try {
            InfoService infoService = new InfoServiceImpl();
            // 注册通讯端口
            LocateRegistry.createRegistry(InfoService.port);
            // 注册通讯路径
            Naming.bind(InfoService.RMI_URL,infoService);

            System.out.println("初始化rmi绑定");

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
