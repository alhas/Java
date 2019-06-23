package com.alhas;


import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Your Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] defaultArray = readIntegers(count);


        System.out.println("your DefaultArray is: " + Arrays.toString(defaultArray) );
        System.out.println("Your Reversed Array is: " + Arrays.toString(reverseArray(defaultArray)));

    }


    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }


    public static int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;

    }


}
