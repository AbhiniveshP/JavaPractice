package com.designpatterns.observer;

public class DataSourcePush extends ObservablePush {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyObservers(value);
    }
}
