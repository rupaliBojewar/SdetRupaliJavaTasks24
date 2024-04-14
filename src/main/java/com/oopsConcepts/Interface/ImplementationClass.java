package com.oopsConcepts.Interface;

public class ImplementationClass implements Interface1,Interface2,Interface3{


    @Override
    public void test1() {
        System.out.println("Execute Test 1");
    }

    @Override
    public void test2() {
        System.out.println("Execute Test 2");
    }

    @Override
    public void test3() {
        System.out.println("Execute Test 3");
    }
}
