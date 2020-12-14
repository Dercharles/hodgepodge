package com.example.hodgepodge.outward;

import javax.xml.transform.Source;

/**
 * @author yangpeng
 * @Classname Popcorn
 * @Description TODO
 * @Date 2020/12/5 12:55 上午
 */
public class Popcorn {

    private Popcorn() {
    }

    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void makingPopcorn(){
        System.out.println("开始制作爆米花");
    }

    public void CleaningThePopcornMachine(){
        System.out.println("清洗爆米花机");
    }

}
