package com.alhas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printArray();
        sortReverse();


    }


    public static void sortReverse() {
        int[] reverseSort = getIntegers(6);
        for (int i = reverseSort.length - 1; i >= 0; i--) {
            System.out.println(reverseSort[i] + " ");
        }

    }

    public static void printArray() {

        int[] myIntegers = getIntegers(6);
        Arrays.sort(myIntegers);
        System.out.println("Your array sorted: " + Arrays.toString(myIntegers));


    }


    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {

            values[i] = scanner.nextInt();

        }

        return values;


    }


}



