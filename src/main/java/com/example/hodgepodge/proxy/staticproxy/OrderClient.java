package com.example.hodgepodge.proxy.staticproxy;

/**
 * @author yangpeng
 * @Classname OrderClient
 * @Description TODO
 * @Date 2020/12/9 10:23 下午
 */
public class OrderClient {
    public static void main(String[] args) {
        OrderImpl order = new OrderImpl();
        OrderProxy orderProxy = new OrderProxy(order);
        orderProxy.createOrder();
    }
}
