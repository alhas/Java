package com.company;

public class calculateFeedAndInches {


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }


        double centimeters = (feet = 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to" + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndIncherToCentimetersOne(feet,remainingInches);
    }


    public static int calcFeetAndIncherToCentimetersOne(double feet, double inch) {
        if (feet >= 0 && (inch >= 0 && inch <= 12)) {
            System.out.println("Feed to Inch " + feet / 12 + " Inch to Cm " + inch * 2.54);

        } else return -1;

        return 1;

    }

    public static int calcFeetAndIncherToCentimetersOne(double inch) {

        if (inch >= 0) {
            System.out.println(inch + " Inch to feed = " + inch * 12);

        } else return -1;

        return 1;
    }

}
