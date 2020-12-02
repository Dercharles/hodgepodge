package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname SlidePhone
 * @Description TODO
 * @Date 2020/11/30 8:45 下午
 */
public class SlidePhone extends Phone {
    public SlidePhone(IBrand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("滑盖手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("滑盖手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("滑盖手机");
    }
}
