package com.basicJava.constructorTest;

public class Test1 {

    String city;

    Test1(String name) {
        this.city = name;
    }

    public void logInVerify() {
        System.out.println("Log in successfully");
        System.out.println("Verify "+city+" is present on webpage ");

    }

}
