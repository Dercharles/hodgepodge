package com.example.hodgepodge.interviewer;

import javax.naming.Name;

/**
 * @author yangpeng
 * @Classname Person
 * @Description TODO
 * @Date 2020/12/22 10:10 下午
 */
public abstract class Person {
    public abstract void accept(Action action, String name);
}
