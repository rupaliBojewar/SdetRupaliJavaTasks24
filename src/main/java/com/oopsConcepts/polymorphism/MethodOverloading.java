package com.oopsConcepts.polymorphism;

public class MethodOverloading {

    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public float sum(int a,float b){
        System.out.println(a+b);
        return a+b;
    }

    public void sum(int a,double b){
        System.out.println(a+b);
    }
}
