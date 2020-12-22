package com.example.hodgepodge.templateMode;

/**
 * @author yangpeng
 * @Classname TemplateClient
 * @Description TODO
 * @Date 2020/12/15 11:57 下午
 */
public class TemplateClient {
    public static void main(String[] args) {
        OrderAbstractImpl orderAbstract = new OrderAbstractImpl();
        orderAbstract.template();
        CreateTMOrderClass createTMOrderClass = new CreateTMOrderClass();
        createTMOrderClass.template();
        CreateOrder createOrder = new CreateOrder();
        createOrder.template();
    }
}
