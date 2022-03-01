package com.designpatterns.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator {

    private List<T> listOfObjects;
    private int currentIndex;

    public ListIterator(List<T> listOfObjects) {
        this.listOfObjects = listOfObjects;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < listOfObjects.size();
    }

    @Override
    public Object current() {
        return listOfObjects.get(currentIndex);
    }

    @Override
    public void next() {
        currentIndex++;
    }
}
