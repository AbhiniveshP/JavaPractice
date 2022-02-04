package com.codewithmosh.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int principal = (int) Console.readNumber("Principal ($1K - $1M): ", 100, 1000000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate (1 - 30): ", 1, 30);
        byte years = (byte) Console.readNumber("Period (in Years 1 - 30): ", 1, 30);

        var mortgageCalculator = new MortgageCalculator(principal, annualInterestRate, years);
        var mortgageReport = new MortgageReport(mortgageCalculator);

        mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule();
    }

}
