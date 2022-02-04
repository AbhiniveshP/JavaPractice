package com.codewithmosh.oop;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, int minValue, int maxValue) {
        double value;
        while(true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= minValue && value <= maxValue) break;
        }
        return value;
    }
}
