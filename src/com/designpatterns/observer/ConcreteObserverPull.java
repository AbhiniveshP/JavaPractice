package com.designpatterns.observer;

public class ConcreteObserverPull implements ObserverPull {

    private DataSourcePull dataSourcePull;

    public ConcreteObserverPull(DataSourcePull dataSourcePull) {
        this.dataSourcePull = dataSourcePull;
    }

    @Override
    public void update() {
        System.out.println("Change notified to Concrete Observer via Pull:: " + dataSourcePull.getValue());
    }
}
