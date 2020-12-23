package com.example.hodgepodge.interviewer;

/**
 * @author yangpeng
 * @Classname Wait
 * @Description TODO
 * @Date 2020/12/22 10:33 下午
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man, String name) {
        System.out.println("这个男人"+name+"待定");
    }

    @Override
    public void getWomanResult(Woman woman, String name) {
        System.out.println("这个女人"+name+"待定");
    }
}
