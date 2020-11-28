package com.example.hodgepodge.adapter.objectadapter;
/**
 * @author yangpeng
 * @Classname Computer
 * @Description TODO
 * @Date 2020/11/28 3:23 下午
 */
public class Computer {

    public void recharge(IVoltage5v iVoltage5){
        int i = iVoltage5.output5();
        if (i == 5){
            System.out.println("可以充电");
        }else {
            System.out.println("电压过高，无法进行充电");
        }
    }
}
