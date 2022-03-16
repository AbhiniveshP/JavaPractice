package com.designpatterns.mediator.signupui;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    protected List<EventHandlerObserver> eventHandlers = new ArrayList<>();

    protected void addEventHandlers(EventHandlerObserver observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (EventHandlerObserver observer: eventHandlers) {
            observer.update();
        }
    }

}
