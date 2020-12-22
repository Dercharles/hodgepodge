package com.example.hodgepodge.proxy.cglibProxy;

/**
 * @author yangpeng
 * @Classname OrderClient
 * @Description TODO
 * @Date 2020/12/15 11:09 下午
 */
public class OrderClient {
    public static void main(String[] args) {
        Order order = new Order();
        ProxyFactory proxyFactory = new ProxyFactory(order);
        Order factory = (Order) proxyFactory.getProxyFactory();
        factory.createOrderImpl();
    }
}
