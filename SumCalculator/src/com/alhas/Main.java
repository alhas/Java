package com.alhas;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator Numbers = new SimpleCalculator();
        Numbers.setFirstNumber(15);
        Numbers.setSecondNumber(23.43210123);
        System.out.println("Add= " + Numbers.getAdditon());
        System.out.println("Division= " + Numbers.getDivisionResult());
        System.out.println("Multi= " + Numbers.getMiltiplicationResult());
        System.out.println("Sub= " + Numbers.getSubtractionResult());
        System.out.println("First Number was= " + Numbers.getFirstNumber());
        System.out.println("Second Number was= " + Numbers.getSecondNumber());

    }
}
