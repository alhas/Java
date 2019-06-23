package com.alhas;

public class NumberToWords {


    public static int getDigitCount(int number) {

        if (number < 1){
            return -1;
        }
        int count = 1;
        while (number >= 10) {
            number /= 10;
            count++;
        }
        System.out.println(count);
        return count;
    }

    public static int reverse(int number) {

        int reverse = 0;
        if (number == 0) {
            return 0;
        }
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
        return reverse;
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        int reverseN = reverse(number);

        for (int i = 0; i < count; i++) {

            int remainder = reverseN % 10;

            int switchValue = remainder;

            switch (switchValue) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                    default:
                        System.out.println("Invalid Value");
                        break;
            }
            reverseN = reverseN / 10;
        }

    }


}
