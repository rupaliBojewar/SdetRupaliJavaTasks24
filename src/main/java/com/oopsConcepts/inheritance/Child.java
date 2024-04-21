package com.oopsConcepts.inheritance;

public class Child extends Parent{

    public void childMethod(){
        System.out.println("Method from child class");
    }

    public static void main(String[] args) {
        Child ch =new Child();
        ch.parentMethod1();
        ch.childMethod();

        Parent P=new Child();//upcasting

        P.parentMethod1();

        Child ch2=(Child) P;//downcasting

        ch2.childMethod();
        ch2.parentMethod1();
    }
}
