package com.designpatterns.observer;

public class ConcreteObserverPush implements ObserverPush {
    @Override
    public void update(Object value) {
        System.out.println("Change notified to Concrete Observer via push style:: " + value);
    }
}
