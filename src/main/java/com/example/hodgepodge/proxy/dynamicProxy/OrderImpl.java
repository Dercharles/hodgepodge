package com.example.hodgepodge.proxy.dynamicProxy;

/**
 * @author yangpeng
 * @Classname OrderImpl
 * @Description TODO
 * @Date 2020/12/9 10:20 下午
 */
public class OrderImpl implements Order {
    @Override
    public void createOrder() {
        System.out.println("创建订单核心");
    }
}
