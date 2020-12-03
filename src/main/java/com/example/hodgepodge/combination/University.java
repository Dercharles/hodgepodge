package com.example.hodgepodge.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangpeng
 * @Classname University
 * @Description TODO
 * @Date 2020/12/3 11:14 下午
 */
public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
