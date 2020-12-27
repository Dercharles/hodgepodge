package com.example.hodgepodge.iterator;

import java.util.Iterator;

/**
 * @author yangpeng
 * @Classname College
 * @Description TODO
 * @Date 2020/12/27 5:21 下午
 */
public interface College {
    /**
     * 获取名字
     * @return
     */
    String getName();

    /**
     * 增加元素
     * @param name
     * @param desc
     */
    void addDepartment(String name,String desc);
    /**
     * 创建迭代器
     * @return
     */
    Iterator createIterator();
}
