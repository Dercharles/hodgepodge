package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname HuaWei
 * @Description TODO
 * @Date 2020/11/30 8:41 下午
 */
public class HuaWei implements IBrand {
    @Override
    public void call() {
        System.out.println("华为正在打电话");
    }

    @Override
    public void open() {
        System.out.println("华为正在开机");
    }

    @Override
    public void close() {
        System.out.println("华为正在关机");
    }
}
