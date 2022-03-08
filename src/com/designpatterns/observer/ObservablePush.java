package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservablePush {

    private List<ObserverPush> observers = new ArrayList<>();

    public void addObserver(ObserverPush observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverPush observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object value) {
        for (ObserverPush observer: observers) observer.update(value);
    }
}
