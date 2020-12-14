package com.example.hodgepodge.proxy.staticproxy;

/**
 * @author yangpeng
 * @Classname OrderProxy
 * @Description TODO
 * @Date 2020/12/9 10:21 下午
 */
public class OrderProxy implements Order{
    OrderImpl orderImpl;

    public OrderProxy(OrderImpl orderImpl) {
        this.orderImpl = orderImpl;
    }

    @Override
    public void createOrder() {
        System.out.println("构建创单前置数据");
        orderImpl.createOrder();
        System.out.println("构建完毕");
    }
}
