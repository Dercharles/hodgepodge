package com.example.hodgepodge.decorator;

import java.math.BigDecimal;

/**
 * @author yangpeng
 * @Classname Drink
 * @Description TODO
 * @Date 2020/12/2 9:01 下午
 */
public abstract class Drink {
    private String desc;
    private float price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
