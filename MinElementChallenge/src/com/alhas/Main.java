package com.alhas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] myIntegers = readIntegers(5);
        int[] sorted = findMin(myIntegers);
        printMin(sorted);


    }

    public static void printMin(int[] array){

            System.out.println("Min Element "  + array[4]);

    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];
        System.out.println("Enter " + count + "integer values: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] findMin(int[] array) {

        int[] findMin = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < findMin.length - 1; i++) {
                if (findMin[i] < findMin[i + 1]) {
                    temp = findMin[i];
                    findMin[i] = findMin[i + 1];
                    findMin[i + 1] = temp;
                    flag =true;

                }
            }
        }

        return findMin;

    }

























}
