package com.example.hodgepodge.decorator.coffee;

import com.example.hodgepodge.decorator.Drink;

/**
 * @author yangpeng
 * @Classname Coffee
 * @Description TODO
 * @Date 2020/12/2 9:57 下午
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
