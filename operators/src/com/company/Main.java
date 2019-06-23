package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1+2 = " + result);

        int previousresult = result;

        result = result -1;

        System.out.println(previousresult + "-1 = " + result);

        previousresult = result;

        result = result = 10;
        System.out.println(previousresult + "*10 ="+ result);

        previousresult = result;

        result = result / 5;

        System.out.println(previousresult + " / 5"+ result);

        previousresult = result;
        System.out.println(previousresult + "% 3"+ result);

        previousresult = result;
        result = result + 1;




        boolean isAlien = false;
        if (isAlien == true);
        System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore < 100);
        System.out.println("you got the high score");


        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100);
            System.out.println("Grater than second top score and less then 100");


        if ((topScore > 90) ||(secondTopScore <= 90));
        System.out.println("One of these tests is true");


        int newValue = 50;
        if(newValue == 50);
            System.out.println("This is True ");


        boolean isCar = false;
        if(isCar = true);
        System.out.println("This is not supposed to happen");


    isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar)
        System.out.println("was is true");



    double doubleValue = 20d;
    double doubleValuetwo = 80d;
    double totaldouble = (doubleValue+doubleValuetwo)/ (25);

    double remainder = (totaldouble / 40);



    if(remainder <= 20);
        System.out.println("Total was over the limit");







    }
}
