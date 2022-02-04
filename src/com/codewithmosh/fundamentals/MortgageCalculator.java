package com.codewithmosh.fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int principal = (int) readNumber("Principal ($1K - $1M): ", 100, 1000000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate (1 - 30): ", 1, 30);
        byte years = (byte) readNumber("Period (in Years 1 - 30): ", 1, 30);

        printMortgage(principal, annualInterestRate, years);

        printPaymentSchedule(principal, annualInterestRate, years);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }

    public static double readNumber(String prompt, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            value = sc.nextFloat();
            if (value >= minValue && value <= maxValue) break;
        }
        return value;
    }

    public static double calculateBalance(int principal, float annualInterestRate,
                                          byte years, short numberOfPaymentsMade) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }

    public static double calculateMortgage(int principal, float annualInterestRate, byte years) {
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return mortgage;
    }
}
