package com.example.hodgepodge.iterator;

import java.util.Iterator;

/**
 * @author yangpeng
 * @Classname ArrayCollegeImpl
 * @Description TODO
 * @Date 2020/12/27 5:23 下午
 */
public class ArrayCollegeImpl implements College{
    Department[] departments;
    int index;

    public ArrayCollegeImpl() {
        departments = new Department[5];
        addDepartment("数组01","01");
        addDepartment("数组02","02");
        addDepartment("数组03","03");
        addDepartment("数组04","04");
        addDepartment("数组05","05");
    }

    /**
     * 获取名字
     *
     * @return
     */
    @Override
    public String getName() {
        return "Array集合";
    }

    /**
     * 增加元素
     *
     * @param name
     * @param desc
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[index] = department;
        index +=1;
    }

    /**
     * 创建迭代器
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ArrayIterator(departments);
    }
}
