package com.example.hodgepodge.singleton;

/**
 * @author yangpeng
 */
public class SingletonClient {
    /**
     *
     * 功能描述: 主方法
     *
     * @param:
     * @return:
     * @Author: yangpeng
     * @date: 2020/11/25 10:43 下午
     */
    public static void main(String[] args) {
        Order order = Order.getOrder();
        Order order1 = Order.getOrder();

        System.out.println(order.equals(order1));
        System.out.println(order.hashCode() == order1.hashCode());
    }
}
