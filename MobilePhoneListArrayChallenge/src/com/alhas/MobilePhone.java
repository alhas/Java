package com.alhas;

import java.util.ArrayList;

public class MobilePhone {

    private static phoneNumber phoneNumber = new phoneNumber();
    private static name name = new name();


private ArrayList<String> contacts = new ArrayList<String>();

public void addContact(String name,String phoneNumber){

    contacts.add(name);
    contacts.add(phoneNumber);

}


}
