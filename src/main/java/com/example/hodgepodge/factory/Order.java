package com.example.hodgepodge.factory;

/**
 * @author yangpeng
 * @Classname Order
 * @Description TODO
 * @Date 2020/11/25 10:48 下午
 */
public abstract class Order {

    protected String type;

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * 功能描述: 创建订单头
     *
     * @param:
     * @return:
     * @Author: yangpeng
     * @date: 2020/11/25 10:52 下午
     */
    public void createOrderHead(){
        System.out.println(type+"订单，创建订单头");
    };

    /**
     *
     * 功能描述: 创建订单行
     *
     * @param:
     * @return:
     * @Author: yangpeng
     * @date: 2020/11/25 10:53 下午
     */
    public void createOrderItem(){
        System.out.println(type+"订单，创建订单行");
    };

    /**
     *
     * 功能描述: 创建支付信息
     *
     * @param:
     * @return:
     * @Author: yangpeng
     * @date: 2020/11/25 10:54 下午
     */
    public void createOrderPayment(){
        System.out.println(type+"订单，创建支付信息");
    };
}
