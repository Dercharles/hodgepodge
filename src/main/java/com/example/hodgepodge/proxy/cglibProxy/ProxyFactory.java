package com.example.hodgepodge.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.xml.transform.Source;
import java.lang.reflect.Method;

/**
 * @author yangpeng
 * @Classname MethodInterceptor
 * @Description TODO
 * @Date 2020/12/15 10:42 下午
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyFactory(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始cglib代理");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理结束");
        return invoke;
    }
}
