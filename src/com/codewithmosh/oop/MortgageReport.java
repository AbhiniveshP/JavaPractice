package com.codewithmosh.oop;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }


    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance: mortgageCalculator.getRemainingBalances()) {
            String balanceFormatted = currencyInstance.format(balance);
            System.out.println(balanceFormatted);
        }
    }

    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
