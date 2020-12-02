package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname Oppo
 * @Description TODO
 * @Date 2020/11/30 8:40 下午
 */
public class Oppo implements IBrand {
    @Override
    public void call() {
        System.out.println("oppo拨打电话");
    }

    @Override
    public void open() {
        System.out.println("oppo正在开机");
    }

    @Override
    public void close() {
        System.out.println("oppo正在关机");
    }
}
