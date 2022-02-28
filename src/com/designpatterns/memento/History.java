package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class History<T> {

    private List<T> states = new ArrayList<>();

    public void push(T state) {
        states.add(state);
    }

    public T pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
