package com.oopsConcepts.Encapsulation;

public class LoginPage {
    private int i= 10;
    private String name;

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public void logIn(){

        System.out.println("Login test pass");
        System.out.println(i);

    }

}
