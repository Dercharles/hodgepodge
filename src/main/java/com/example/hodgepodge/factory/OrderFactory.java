package com.example.hodgepodge.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yangpeng
 * @Classname OrderFactory
 * @Description TODO
 * @Date 2020/11/25 10:46 下午
 * @Created by yangpeng
 */
public abstract class OrderFactory {
    abstract Order createOrder(String orderType);

    public void OrderFactory(){
        Order orderEntity;
        String orderType;

        do {
            orderType = getType();
            orderEntity = createOrder(orderType);
            if (orderEntity == null){
                System.out.println("创单失败");
                break;
            }
            orderEntity.createOrderHead();
            orderEntity.createOrderItem();
            orderEntity.createOrderPayment();
        }while (true);
    }

    private String getType(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入披萨的种类：");
        String str = null;
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
