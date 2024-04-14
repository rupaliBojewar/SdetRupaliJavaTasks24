package com.oopsConcepts.Encapsulation;

public class LoginTest {
    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        loginPage.setName("Selenium");
        System.out.println(loginPage.getName());
        loginPage.logIn();

    }
}
