package com.example.hodgepodge.singleton;
/**
 * @description: TODO 
 * @author yangpeng
 * @date 2020/11/25 10:13 下午
 * @version 1.0
 */
public class Order {
    private volatile static Order order = null;

    private Order() {
    }

    public static Order getOrder(){
        if (order == null){
            synchronized (Order.class){
                if (order == null){
                    order = new Order();
                }
            }
        }
        return order;
    }
}
