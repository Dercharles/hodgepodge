package com.example.hodgepodge.builder;

/**
 * @author yangpeng
 * @Classname OrderDirectory
 * @Description TODO
 * @Date 2020/11/26 9:25 下午
 */
public class OrderDirectory {

    OrderBuilder orderBuilder;

    public OrderDirectory(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public Order constructHOrder(){
        orderBuilder.createOrderHead();
        orderBuilder.createOrderLine();
        return new Order();
    }
}
