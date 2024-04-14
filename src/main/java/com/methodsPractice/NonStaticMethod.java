package com.methodsPractice;

public class NonStaticMethod {
    public static void main(String[] args) {
        NonStaticMethod nc=new NonStaticMethod();
        nc.method1();


    }

    public void method1(){

        System.out.print("Non Static method1");
    }
}
