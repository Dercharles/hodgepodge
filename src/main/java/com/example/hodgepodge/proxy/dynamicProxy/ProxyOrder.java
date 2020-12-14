package com.example.hodgepodge.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangpeng
 * @Classname ProxyOrder
 * @Description TODO
 * @Date 2020/12/9 11:12 下午
 */
public class ProxyOrder {

    private Object target;

    public ProxyOrder(Object target) {
        this.target = target;
    }


    public Object getProxyInstnce(){
        /*/**
         *
         * 功能描述:
         *
         * @param: ClassLoader loader 需要代理类的类加载器,
                   Class<?>[] interfaces 代理类的接口方法,
                   InvocationHandler h 执行目标对象的方法
         * @return:
         * @return: java.lang.Object
         * @Author: yangpeng
         * @date: 2020/12/9 11:19 下午
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("正在执行jdk代理");
                Object invoke = method.invoke(target, args);
                System.out.println("执行完毕");
                return invoke;
            }
        });
    }
}
