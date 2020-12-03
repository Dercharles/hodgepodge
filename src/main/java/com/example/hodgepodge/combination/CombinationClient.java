package com.example.hodgepodge.combination;

/**
 * @author yangpeng
 * @Classname CombinationClient
 * @Description TODO
 * @Date 2020/12/3 11:46 下午
 */
public class CombinationClient {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "好学校");
        OrganizationComponent university2 = new University("北京大学", "也是好学校");

        OrganizationComponent college = new College("java", "用的人比较多的专业");
        OrganizationComponent college2 = new College("T台专业", "都是大长腿");

        OrganizationComponent specialty = new Specialty("软件研发系", "互联网热门专业");
        OrganizationComponent specialty2 = new Specialty("模特专业", "好多美女的地方");

        college.add(specialty);
        university.add(college);

        university.print();
    }
}
