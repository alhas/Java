package com.alhas;

public class Main {

    public static void main(String[] args) {

        int switchValue = 2;

        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2 ");
        }


        char character = 'B';

        switch (character) {

            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Founded");
                break;

            default:
                System.out.println("Not Founded");
                break;

        }


        String month = "JANUARy";
        switch (month.toLowerCase()) {

            case "January":
                System.out.println("Jan");
                break;

            case "June":
                break;

            default:
                System.out.println("Not Sure");

        }

    }
}

