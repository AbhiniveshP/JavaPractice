package com.codewithmosh.oop;

public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private int principal;
    private float annualInterestRate;
    private byte years;

    public MortgageCalculator(int principal, float annualInterestRate, byte years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }


    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        short numberOfPayments = getNumberOfPayments();

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return mortgage;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= getNumberOfPayments(); month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
    }
}
