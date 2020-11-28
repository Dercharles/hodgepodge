package com.example.hodgepodge.adapter.objectadapter;

/**
 * @author yangpeng
 * @Classname VoltageAdapterObject
 * @Description TODO
 * @Date 2020/11/28 4:16 下午
 */
public class VoltageAdapterObject implements IVoltage5v{
    private Voltage220 voltage220;

    public VoltageAdapterObject(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int vo = voltage220.output220();
        int vs = vo/44;
        System.out.println("正在输出："+vs+"V电压");
        return vs;
    }
}
