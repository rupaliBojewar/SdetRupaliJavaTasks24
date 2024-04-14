package com.oopsConcepts.polymorphism;

public class Child extends Parent{


    public static void main(String[] args) {
        Child child=new Child();
        child.click();

        Parent parent=new Child();
        parent.click();
    }
    @Override
    public void click(){
        System.out.println("Child element clicked successfully");
    }
}
