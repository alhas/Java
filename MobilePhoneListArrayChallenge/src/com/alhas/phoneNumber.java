package com.alhas;

import java.util.ArrayList;

public class phoneNumber {


    private ArrayList<String> number = new ArrayList<String>();

    public void addNumber(String item) {

        number.add(item);

    }


    public void updateNumber(String currentItem, String newItem) {


        int position = findItem(currentItem);
        if (position >= 0 && (currentItem != newItem)) {
            updateNumber(position, newItem);
        }
    }

    private void updateNumber(int position, String newItem) {
        number.set(position, newItem);
        System.out.println("Contact is " + (position + 1) + " has been updated");
    }


    public int findItem(String searchItem) {
        return number.indexOf(searchItem);
    }


    public void removeNumber(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeNumber(position);
        }
    }

    private void removeNumber(int position) {
        number.remove(position);
    }

    public void printNumberList() {
        System.out.println("You have" + number.size() + " numbers in your list.");
        for (int i = 0; i < number.size(); i++) {
            System.out.println((i + 1) + ", " + number.get(i));
        }
    }
}














