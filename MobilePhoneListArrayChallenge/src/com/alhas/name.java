package com.alhas;

import java.util.ArrayList;

public class name {


    private ArrayList<String> name = new ArrayList<String>();

    public void addName(String item) {

        name.add(item);

    }

    public void updateName(String currentItem, String newItem) {

        int position = findName(currentItem);
        if (position >= 0 && (currentItem != newItem)) {
            updateName(position, newItem);
        }
    }

    private void updateName(int position, String newItem) {
        name.set(position, newItem);
        System.out.println("Contact is " + (position + 1) + " has been updated");
    }


    public int findName(String searchItem) {
        return name.indexOf(searchItem);
    }


    public void removeName(String item) {
        int position = findName(item);
        if (position >= 0) {
            removeName(position);
        }
    }

    private void removeName(int position) {
        name.remove(position);
    }

    public void printnames(){
        System.out.println("You have "+ name.size() + " names in your name list.");
        for(int i = 0; i< name.size(); i++){
            System.out.println((i+1)+", " + name.get(i));
        }

    }


}
