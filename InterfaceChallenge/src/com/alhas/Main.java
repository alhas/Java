package com.alhas;

public class Main {

    public static void main(String[] args) {

        ClassOne numberOne = new ClassOne();
        ClassTwo numberTwo = new ClassTwo();

        numberOne.SavedArrayList(12);
        numberTwo.SavedArrayList(13);

        System.out.println(ISaveable.list);

        for (int i = 0; i < ISaveable.list.size(); i++) {
            System.out.println(ISaveable.list.get(i));
        }

    }
}
