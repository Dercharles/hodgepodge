package com.example.hodgepodge.outward;

/**
 * @author yangpeng
 * @Classname Projector
 * @Description TODO
 * @Date 2020/12/5 12:52 上午
 */
public class Projector {
    private Projector() {
    }

    private static Projector projector = new Projector();

    public static Projector getInstance(){
        return projector;
    }

    public void open(){
        System.out.println("打开投影仪");
    }

    public void close(){
        System.out.println("关闭投影仪");
    }
}
