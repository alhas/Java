package com.alhas;

public class Main {

    public static void main(String[] args) {

        for (double iRate = 8; iRate > 1; iRate--) {
            System.out.println("10,000 at " + iRate + " interest = " + String.format("%.1f", calculateInterest(10000.0, iRate)));
        }

        isPrime(12);

        for (int i = 0; i < 5; i++) {

            System.out.println("Loop " + i + " hello");
        }
        for (int num = 0; num <= 1000; num++) {

            isPrime(num);
        }

    }

    private static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println(n + " Prime Number");
        return true;

    }


}
