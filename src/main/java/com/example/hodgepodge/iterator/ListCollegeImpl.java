package com.example.hodgepodge.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangpeng
 * @Classname ListCollege
 * @Description TODO
 * @Date 2020/12/27 5:22 下午
 */
public class ListCollegeImpl implements College {
    List<Department> departments;

    public ListCollegeImpl() {
        departments = new ArrayList<Department>();
        addDepartment("list集合01","01");
        addDepartment("list集合02","02");
        addDepartment("list集合03","03");
        addDepartment("list集合04","04");
        addDepartment("list集合05","05");
    }

    /**
     * 获取名字
     *
     * @return
     */
    @Override
    public String getName() {
        return "List集合";
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
        departments.add(department);
    }

    /**
     * 创建迭代器
     *
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ListIterator(departments);
    }
}
