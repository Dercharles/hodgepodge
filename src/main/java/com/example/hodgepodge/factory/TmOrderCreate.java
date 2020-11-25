package com.example.hodgepodge.factory;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

/**
 * @author yangpeng
 * @Classname TmOrderCreate
 * @Description TODO
 * @Date 2020/11/25 11:10 下午
 */
public class TmOrderCreate extends OrderFactory {
    @Override
    Order createOrder(String orderType) {
       Order order = null;

       if (orderType.equals("tm")){
           order = new TmOrder();
           order.setType("天猫-时效");
           return order;
       }else if (orderType.equals("jd")){
           order = new JdOrder();
           order.setType("京东-时效");
           return order;
        }else {
           return order;
       }
    }
}
