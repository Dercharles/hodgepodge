package com.example.hodgepodge.iterator;

/**
 * @author yangpeng
 * @Classname Department
 * @Description TODO
 * @Date 2020/12/27 3:56 下午
 */
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
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
