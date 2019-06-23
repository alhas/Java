package com.alhas;

public class someone {

    private String firstname;
    private String lastName;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age;
        if (age <= 0 || age > 100) {
            setAge(0);
        }
    }

    public boolean isTeen() {

        if (age > 12 && age < 20) {
            return true;
        } else return false;

    }

    public String getFullName() {

        if (firstname.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstname;
        } else if (firstname.isEmpty()) {
            return lastName;
        } else return firstname +" "+ lastName;
    }

}
























