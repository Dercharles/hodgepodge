package com.example.hodgepodge.decorator;

/**
 * 装饰者类
 * @author yangpeng
 * @Classname Decoraor
 * @Description TODO
 * @Date 2020/12/2 9:34 下午
 */
public class Decoraor extends Drink{
    private Drink drink;

    public Decoraor(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+",价格："+super.getPrice()+",配料："+drink.getDesc()+"，价格:"+drink.getPrice();
    }
}
