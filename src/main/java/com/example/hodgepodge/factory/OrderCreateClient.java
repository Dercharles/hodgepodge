package com.example.hodgepodge.factory;

/**
 * @author yangpeng
 * @Classname OrderCreateClient
 * @Description TODO
 * @Date 2020/11/25 11:09 下午
 */
public class OrderCreateClient {
    public static void main(String[] args) {
        TmOrderCreate tmOrderCreate = new TmOrderCreate();
        tmOrderCreate.OrderFactory();
    }
}
