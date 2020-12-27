package com.example.hodgepodge.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author yangpeng
 * @Classname ArrayIterator
 * @Description TODO
 * @Date 2020/12/27 3:52 下午
 */
public class ArrayIterator implements Iterator {

    Department[] departments;
    int index =0;

    public ArrayIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null){
            return false;
        }
        return true;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() {
        Department department = departments[index];
        index+=1;
        return department;
    }
}
