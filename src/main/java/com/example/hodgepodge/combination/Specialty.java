package com.example.hodgepodge.combination;

/**
 * @author yangpeng
 * @Classname Specialty
 * @Description TODO
 * @Date 2020/12/3 11:44 下午
 */
public class Specialty extends OrganizationComponent{

    public Specialty(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
