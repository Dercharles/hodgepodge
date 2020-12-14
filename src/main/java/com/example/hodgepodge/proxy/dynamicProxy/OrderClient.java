package com.example.hodgepodge.proxy.dynamicProxy;

import com.example.hodgepodge.proxy.staticproxy.OrderProxy;

/**
 * @author yangpeng
 * @Classname OrderClient
 * @Description TODO
 * @Date 2020/12/9 10:23 下午
 */
public class OrderClient {
    public static void main(String[] args) {
        Order order = new OrderImpl();
        Order proxyInstnce = (Order)new ProxyOrder(order).getProxyInstnce();
        proxyInstnce.createOrder();
    }
}
