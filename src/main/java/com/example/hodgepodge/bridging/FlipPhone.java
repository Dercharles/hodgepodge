package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname FlipPhone
 * @Description TODO
 * @Date 2020/11/30 8:45 下午
 */
public class FlipPhone extends Phone {
    public FlipPhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("翻盖式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("翻盖式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("翻盖式手机");
    }
}
