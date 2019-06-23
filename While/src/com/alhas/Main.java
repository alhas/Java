package com.alhas;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
//        /*
//        while(count != 6){
//            System.out.println("Caunt value is " + count);
//            count++;
//        }
//*/
//
//        count = 6;
//        do {
//
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        }while (count != 6);

        int total = 0;
        int number = 4;
        int finishNumber = 20;

            while (number <= finishNumber) {
                number++;
                if (!IsEvenNumber.isEvenNumber(number)) {
                    //total += number;
                    continue;
                }
                total++;
                if(total >= 6){
                    break;
                }
            }

        System.out.println(total + " Total number");

    }


}
