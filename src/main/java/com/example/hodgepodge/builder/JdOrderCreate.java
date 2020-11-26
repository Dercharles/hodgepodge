package com.example.hodgepodge.builder;

/**
 * @author yangpeng
 * @Classname JdOrderCreate
 * @Description TODO
 * @Date 2020/11/26 9:20 下午
 */
public class JdOrderCreate implements OrderBuilder {
    @Override
    public void createOrderHead() {
        System.out.println("创建京东订单头");
    }

    @Override
    public void createOrderLine() {
        System.out.println("创建京东订单行");
    }
}
