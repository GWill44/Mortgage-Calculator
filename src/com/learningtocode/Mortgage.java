package com.learningtocode;
import java.text.NumberFormat;
public class Mortgage {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;
    private static float calculateMonthlyMortgage() {
        float monthlyInterest = Console.getAnnualInterest() / (MONTHS_IN_YEAR * PERCENT);
        short numberOfMonths = (short) (Console.getPeriod() * MONTHS_IN_YEAR);
        float monthlyMortgage = (float) (Console.getPrincipal() * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfMonths))) / ((Math.pow((1 + monthlyInterest), numberOfMonths)) - 1)));
        return monthlyMortgage;
    }
    public static void printMortgage(){
        float monthlyMortgage = calculateMonthlyMortgage();
        String monthlyMortgageS = NumberFormat.getCurrencyInstance().format(monthlyMortgage);
        System.out.println("\nMORTGAGE\n--------\nMonthly Payment: " + monthlyMortgageS);
    }
}

