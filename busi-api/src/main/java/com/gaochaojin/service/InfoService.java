package com.gaochaojin.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 13:32 2020/1/15
 */
public interface InfoService extends Remote {

    String RMI_URL = "rmi://127.0.0.1:9080/infoService";
    int port = 9080;

    Object sayHello(String name) throws RemoteException;
    Object passInfo(Map<String,String> info) throws RemoteException;


}
