package com.designpatterns.template;

public class ClearScreenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Clearing screen...");
    }

    @Override
    protected void afterClose() {
        System.out.println("No Operation after close");
    }
}
