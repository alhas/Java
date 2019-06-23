package com.alhas;

public class SimpleCalculator {

    public double firstNumber;
    public double secondNumber;


    public double getFirstNumber() {

        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;

    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditon() {

        return firstNumber + secondNumber;
    }


    public double getSubtractionResult() {

        return secondNumber - firstNumber;
    }

    public double getMiltiplicationResult() {

        return firstNumber * secondNumber;

    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        } else {

            return secondNumber / firstNumber;
        }


    }
}
