package com.oopsConcepts.inheritance;

public class Child1
        extends Parent{

    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.parentMethod1();
        System.out.println(ch.a);
        System.out.println(ch.str);

    }
}
