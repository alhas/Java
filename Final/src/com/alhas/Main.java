package com.alhas;

public class Main {

    public static void main(String[] args) {

  /*  SomeClass one = new SomeClass("One");
    SomeClass two = new SomeClass("Two");
    SomeClass three = new SomeClass("Three");


        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());


       // System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 674312;
        Password password = new ExtentdedPassword(pw);
        password.storepassWord();

        password.letMeIn(1);
        password.letMeIn(123151);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
        */


        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
