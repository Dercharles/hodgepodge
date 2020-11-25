package com.example.hodgepodge.factory;

/**
 * @author yangpeng
 * @Classname JdOrderCreate
 * @Description TODO
 * @Date 2020/11/25 11:10 下午
 */
public class JdOrderCreate extends OrderFactory{
    @Override
    Order createOrder(String orderType) {
        Order order = null;

        if (orderType.equals("tm")){
            order = new TmOrder();
            order.setType("天猫-普通");
            return order;
        }else if (orderType.equals("jd")){
            order = new JdOrder();
            order.setType("京东-普通");
            return order;
        }else {
            return order;
        }
    }
}
