package com.example.hodgepodge.interviewer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yangpeng
 * @Classname ObjectStucture
 * @Description TODO
 * @Date 2020/12/22 10:11 下午
 */
public class ObjectStucture {
    private List<Person> personList = new LinkedList<>();

    public void attch(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    public void display(Action action,String name){
        for (Person person : personList) {
            person.accept(action, name);
        }
    }
}
