package com.alhas;

public class Main {

    public static void main(String[] args) {


        VipCustomer vipCustomer = new VipCustomer("Bahtiyar Ali alhas", 6000
                , "alhas@outlook.com");
        System.out.println(vipCustomer.getName() + " " + vipCustomer.getCreditLimit() + " " + vipCustomer.getEmailAdress());

        System.out.println("");

        VipCustomer emtpy = new VipCustomer();
        System.out.println(emtpy.getName() + " " + emtpy.getCreditLimit() + " " + emtpy.getEmailAdress());

        System.out.println("");

        VipCustomer twoValues = new VipCustomer("Ahmet Alhas", 7000);
        System.out.println(twoValues.getName() + " " + twoValues.getCreditLimit());
        System.out.println();


        BankAccount bankAccount = new BankAccount(1, 0.00, "Bahtiyar Ali ALHAS"
                , "bahtiyaralialhas@gmail.com"
                , "+48 514 256 606");


        System.out.println("Your Name is: " + bankAccount.getCustomerName());
        System.out.println("Your Number: " + bankAccount.getNumber());
        System.out.println("Your E-mail: " + bankAccount.getEmail());
        System.out.println("Your Phone Number: " + bankAccount.getPhoneNumber());
        System.out.println("Your Balance: " + bankAccount.getBalance());
        bankAccount.deposito(50);
        bankAccount.withdrawal(40);


        BankAccount bahtiyar = new BankAccount("Bahtiyar Ali ALHAS"
                , "bahtiyaralialhas@gmail.com"
                , "+48 514 256 606");
        System.out.println(bahtiyar.getCustomerName() + " " + bahtiyar.getEmail() + " " + bahtiyar.getPhoneNumber());
    }
}
