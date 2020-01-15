package com.gaochaojin.utils;

import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description: 反射工具类
 * @Date Created in 13:46 2020/1/15
 */
public class InvokeUtils {

    /**
     * java反射
     * @param target 目标对象
     * @param methodName 目标方法
     * @param argTypes 方法参数类型
     * @param args 实参
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static Object invoke(Object target,String methodName,
                                Class[] argTypes,Object[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = target.getClass().getMethod(methodName, argTypes);
        return method.invoke(target,args);
    }

    public static Object invoke(Map<String,String> info, ApplicationContext ctx){
        String target = info.get("target");
        String methodName = info.get("methodName");
        String arg = info.get("arg");
        try {
            return invoke(ctx.getBean(target),methodName,new Class[]{String.class},new Object[]{arg});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
