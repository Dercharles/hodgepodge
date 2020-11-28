package com.example.hodgepodge.adapter.classadapter;

/**
 * @author yangpeng
 * @Classname VoltageAdapter
 * @Description TODO
 * @Date 2020/11/28 3:11 下午
 */
public class VoltageAdapter extends Voltage220 implements IVoltage5 {
    @Override
    public int output5() {
        int vo = output220();
        int vs = vo/44;
        System.out.println("正在输出："+vs+"V电压");
        return vs;
    }
}
