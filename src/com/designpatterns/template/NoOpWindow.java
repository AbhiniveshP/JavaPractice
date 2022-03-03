package com.designpatterns.template;

public class NoOpWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("No Operation Window");
    }

    @Override
    protected void afterClose() {
        System.out.println("No Operation Window");
    }
}
