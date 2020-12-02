package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname XiaoMi
 * @Description TODO
 * @Date 2020/11/30 8:40 下午
 */
public class XiaoMi implements IBrand {
    @Override
    public void call() {
        System.out.println("小米拨打电话");
    }

    @Override
    public void open() {
        System.out.println("小米正在开机");
    }

    @Override
    public void close() {
        System.out.println("小米正在关机");
    }
}
