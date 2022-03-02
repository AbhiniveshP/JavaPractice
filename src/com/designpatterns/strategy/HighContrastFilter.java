package com.designpatterns.strategy;

public class HighContrastFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Filter to file: " + fileName + " using HighContrast Filter");
    }
}
