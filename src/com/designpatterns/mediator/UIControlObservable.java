package com.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControlObservable {

    protected List<EventHandlerObserver> eventHandlerObservers = new ArrayList<>();

    protected void attachEventHandler(EventHandlerObserver eventHandlerObserver) {
        eventHandlerObservers.add(eventHandlerObserver);
    }

    protected void notifyEventHandlers() {
        for (EventHandlerObserver eventHandlerObserver : eventHandlerObservers)
            eventHandlerObserver.update();
    }
}
