package com.example.hodgepodge.bridging;

/**
 * @author yangpeng
 * @Classname Phone
 * @Description TODO
 * @Date 2020/11/30 8:43 下午
 */
public abstract class Phone {
    private IBrand brand;

    public Phone(IBrand brand) {
        super();
        this.brand = brand;
    }

    protected void open(){
        brand.open();
    }

    protected void call(){
       brand.call();
    }

    protected void close(){
       brand.close();
    }

}
