package com.example.hodgepodge.decorator.burden;

import com.example.hodgepodge.decorator.Decoraor;
import com.example.hodgepodge.decorator.Drink;

import java.math.BigDecimal;

/**
 * @author yangpeng
 * @Classname Milk
 * @Description TODO
 * @Date 2020/12/2 9:34 下午
 */
public class Milk extends Decoraor {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(6);
    }
}
