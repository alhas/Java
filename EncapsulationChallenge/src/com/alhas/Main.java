package com.alhas;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(70, 0, 0);

        printer.print(10, 11);

        System.out.println("Your printed = " + printer.getNumberOfPagesPrinted() + " pages" + "and " + printer.getDublexPrinter() + " pages" + " Your toner level is " + printer.getTonerLevel());


        printer.fillUpToner(40);
        System.out.println("your toner filled new value is " + printer.getTonerLevel() + "%");


    }
}
