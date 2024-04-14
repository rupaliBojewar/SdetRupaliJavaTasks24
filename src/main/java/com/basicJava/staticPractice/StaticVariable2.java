package com.basicJava.staticPractice;

public class StaticVariable2 {


    public void test1(){

        System.out.println(StaticVariable1.orgName);
    }

    public static void main(String[] args) {
        //String name=  StaticVariable1.orgName;
        StaticVariable2 staticVariable2 =new StaticVariable2();
        staticVariable2.test1();
    }
}
