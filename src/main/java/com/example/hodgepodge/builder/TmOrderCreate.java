package com.example.hodgepodge.builder;

/**
 * @author yangpeng
 * @Classname TmOrderCreate
 * @Description TODO
 * @Date 2020/11/26 9:18 下午
 */
public class TmOrderCreate implements OrderBuilder {
    @Override
    public void createOrderHead() {
        System.out.println("创建天猫订单头");
    }

    @Override
    public void createOrderLine() {
        System.out.println("创建天猫订单行");
    }
}
