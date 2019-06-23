package com.alhas;

public class Main {

    public static void main(String[] args) {


        someone someone = new someone();

        someone.setFirstname("");
        someone.setLastName("");
        someone.setAge(10);
        System.out.println("FullName= "+ someone.getFullName());
        System.out.println("Age= "+ someone.getFirstname());

        someone.setFirstname("Bahtiyar");
        someone.setLastName("Alhas");
        someone.setAge(26);
        System.out.println("First Name= " + someone.getFirstname());
        System.out.println("Last Name= " + someone.getLastName());
        System.out.println("Age= "+ someone.getAge());
        System.out.println("Full Name= " + someone.getFullName());
        System.out.println("Is teen= " + someone.isTeen());

    }
}
