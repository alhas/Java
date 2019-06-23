package com.alhas;

public class Printer {


    private double tonerLevel;
    private int numberOfPagesPrinted;
    private int dublexPrinter;

    double eachpage = 0.2;


    public Printer(double tonerLevel, int numberOfPagesPrinted, int dublexPrinter) {
        if (tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.dublexPrinter = dublexPrinter;
    }


    public void fillUpToner(double fill) {
        this.tonerLevel = this.tonerLevel + fill;
        if (tonerLevel > 100) {
            System.out.println("OverFlow warning");
            this.tonerLevel = 100;
        }
    }

    public void print(int page, int dublexPrinter) {
        this.dublexPrinter = dublexPrinter;
        this.numberOfPagesPrinted = this.numberOfPagesPrinted + page;
        this.tonerLevel -= (dublexPrinter * (eachpage * 2)) + eachpage * page;

    }


    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public int getDublexPrinter() {
        return dublexPrinter;
    }

    public double getEachpage() {
        return eachpage;
    }
}
