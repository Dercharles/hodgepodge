package com.example.hodgepodge.outward;

/**
 * @author yangpeng
 * @Classname Curtain
 * @Description TODO
 * @Date 2020/12/5 12:53 上午
 */
public class Curtain {
    private Curtain() {
    }

    private volatile static Curtain curtain = new Curtain();

    public static Curtain getInstance(){
        return curtain;
    }

    public void open(){
        System.out.println("打开窗帘");
    }

    public void close(){
        System.out.println("关闭窗帘");
    }
}
