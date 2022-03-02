package com.designpatterns.strategy;

public class BWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Filter to file: " + fileName + " using B&W Filter");
    }
}
