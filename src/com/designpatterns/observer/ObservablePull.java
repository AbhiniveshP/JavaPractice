package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservablePull {

    private List<ObserverPull> observers = new ArrayList<>();

    public void addObserver(ObserverPull observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverPull observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ObserverPull observer: observers) observer.update();
    }
}
