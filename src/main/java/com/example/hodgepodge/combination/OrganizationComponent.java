package com.example.hodgepodge.combination;

/**
 * @author yangpeng
 * @Classname OrganizationComponent
 * @Description TODO
 * @Date 2020/12/3 11:08 下午
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
