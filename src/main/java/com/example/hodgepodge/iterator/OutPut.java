package com.example.hodgepodge.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangpeng
 * @Classname OutPut
 * @Description TODO
 * @Date 2020/12/27 5:37 下午
 */
public class OutPut {
    List<College> colleges;

    public OutPut(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println("名称："+ next.getName());
            printDepartment(next.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
}
