package com.example.hodgepodge.interviewer;

/**
 * @author yangpeng
 * @Classname Fail
 * @Description TODO
 * @Date 2020/12/22 10:09 下午
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man,String name) {
        System.out.println("这个男人"+name+"不行");
    }

    @Override
    public void getWomanResult(Woman woman, String name) {
        System.out.println("这个女人"+name+"不行");
    }
}
