package com.example.hodgepodge.decorator.burden;

import com.example.hodgepodge.decorator.Decoraor;
import com.example.hodgepodge.decorator.Drink;

import java.math.BigDecimal;

/**
 * @author yangpeng
 * @Classname Bread
 * @Description TODO
 * @Date 2020/12/2 9:34 下午
 */
public class Bread extends Decoraor {
    public Bread(Drink drink) {
        super(drink);
        setDesc("面包");
        setPrice(10);
    }
}
