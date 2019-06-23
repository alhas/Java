package com.alhas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int sum = 0;
        int counter = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter your  " + order + " number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }

        }

        System.out.println("Your numbers sum equal to: " + sum);
        scanner.close();
    }
}
