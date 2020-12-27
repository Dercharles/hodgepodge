package com.example.hodgepodge.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author yangpeng
 * @Classname ListIterator
 * @Description TODO
 * @Date 2020/12/27 3:52 下午
 */
public class ListIterator implements Iterator {
    List<Department> departments;
    int index = -1;

    public ListIterator(List<Department> departments) {
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
        if (index >= departments.size()-1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Object next() {
        return departments.get(index);
    }
}
