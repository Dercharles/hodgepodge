package com.example.hodgepodge.interviewer;

/**
 * @author yangpeng
 * @Classname Man
 * @Description TODO
 * @Date 2020/12/22 10:10 下午
 */
public class Man extends Person{
    @Override
    public void accept(Action action, String name) {
        action.getManResult(this,name);
    }
}
