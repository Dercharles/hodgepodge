package com.example.hodgepodge.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangpeng
 * @Classname Client
 * @Description TODO
 * @Date 2020/12/27 5:44 下午
 */
public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();

        ArrayCollegeImpl arrayCollege = new ArrayCollegeImpl();
        ListCollegeImpl listCollege = new ListCollegeImpl();

        colleges.add(listCollege);
       colleges.add(arrayCollege);

        OutPut outPut = new OutPut(colleges);
        outPut.printCollege();
    }
}
