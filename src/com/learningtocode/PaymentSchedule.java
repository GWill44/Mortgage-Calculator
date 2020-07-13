package com.learningtocode;
import java.text.NumberFormat;
public class PaymentSchedule {
    private static short totalNumberOfPayments = (short) (Console.getPeriod() * Mortgage.MONTHS_IN_YEAR);
    private static double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = Console.getAnnualInterest() / (Mortgage.MONTHS_IN_YEAR * Mortgage.PERCENT);
        double balance = Console.getPrincipal() * ((Math.pow(1 + monthlyInterest, totalNumberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, totalNumberOfPayments) - 1));
        return balance;
    }
    public static void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for (short numberOfPaymentsMade = 1; numberOfPaymentsMade <= totalNumberOfPayments; numberOfPaymentsMade++) {
            double balance = calculateBalance(numberOfPaymentsMade);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}