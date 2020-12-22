package com.example.hodgepodge.templateMode;

/**
 * @author yangpeng
 * @Classname OrdersAbstract
 * @Description TODO
 * @Date 2020/12/15 11:20 下午
 */
public abstract class OrdersAbstract {
    public final void template(){
        orderType();
        if (check()) {
            method01();
        }
        method03();
        method02();
    }

    public abstract void orderType();

    public void method01(){
        System.out.println("创建订单头");
    };
    public void method02(){
        System.out.println("创建订单行");
    };
    public void method03(){
        System.out.println("创建订单发货信息");
    };

    public boolean check(){
        return true;
    }
}
