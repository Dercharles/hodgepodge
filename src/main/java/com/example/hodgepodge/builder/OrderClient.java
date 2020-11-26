package com.example.hodgepodge.builder;

/**
 * @author yangpeng
 * @Classname OrderClient
 * @Description TODO
 * @Date 2020/11/26 10:28 下午
 */
public class OrderClient {
    public static void main(String[] args) {
        TmOrderCreate tmOrderCreate = new TmOrderCreate();
        OrderDirectory orderDirectory = new OrderDirectory(tmOrderCreate);
        Order order = orderDirectory.constructHOrder();
    }
}
