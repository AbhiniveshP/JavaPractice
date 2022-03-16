package com.designpatterns.mediator;

// This is a functional interface => interface with a single method.
// Concrete implementation can be created using a lambda function.
public interface EventHandlerObserver {
    void update();
}
