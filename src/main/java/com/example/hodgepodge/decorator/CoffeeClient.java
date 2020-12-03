package com.example.hodgepodge.decorator;

import com.example.hodgepodge.decorator.burden.Bread;
import com.example.hodgepodge.decorator.burden.Milk;
import com.example.hodgepodge.decorator.coffee.Cappuccino;

/**
 * @author yangpeng
 * @Classname CoffeeClient
 * @Description TODO
 * @Date 2020/12/2 10:37 下午
 */
public class CoffeeClient {
    public static void main(String[] args) {
        Drink cappuccino = new Cappuccino();

        System.out.println(cappuccino.getDesc());
        System.out.println(cappuccino.cost());

        cappuccino = new Milk(cappuccino);

        System.out.println(cappuccino.getDesc());
        System.out.println(cappuccino.cost());

        cappuccino = new Bread(cappuccino);
        System.out.println(cappuccino.getDesc());
        System.out.println(cappuccino.cost());
    }
}
