package com.example.hodgepodge.builder;

/**
 * @author yangpeng
 * @Classname Order
 * @Description TODO
 * @Date 2020/11/26 8:55 下午
 */
public class Order {
    private String orderDocNo;
    private String orderType;
    private String orderSource;

    public Order() {
    }

    public String getOrderDocNo() {
        return orderDocNo;
    }

    public void setOrderDocNo(String orderDocNo) {
        this.orderDocNo = orderDocNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }
}
