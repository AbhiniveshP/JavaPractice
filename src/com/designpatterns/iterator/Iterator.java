package com.designpatterns.iterator;

public interface Iterator<T> {

    boolean hasNext();
    T current();
    void next();
}
