package com.learningtocode;
import java.util.Scanner;
public class Console {
    private static int principal;
    private static float annualInterest;
    private static byte period;
    public static void promptAndSetValues() {
        Console.principal = (int) readNumber("Principal (£1k - £1m): ", 1000, 1000000);
        Console.annualInterest = (float) readNumber("Annual Interest Rate (%): ", 0.01, 40);
        Console.period = (byte) readNumber("Period (Years): ", 1, 40);
    }
    private static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    public static int getPrincipal() {
        return principal;
    }
    public static float getAnnualInterest() {
        return annualInterest;
    }
    public static byte getPeriod() {
        return period;
    }
}