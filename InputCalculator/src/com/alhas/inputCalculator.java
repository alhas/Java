package com.alhas;

import java.util.Scanner;

public class inputCalculator {


    public static void inputThenPrintSumAndAvarage() {

        Scanner scanner = new Scanner((System.in));
        int sum = 0;
        long avarage = 0;
        System.out.println("Enter your numbers...");
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                avarage++;
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum +" AVG =  "+ Math.round(sum/avarage));
    }
}


