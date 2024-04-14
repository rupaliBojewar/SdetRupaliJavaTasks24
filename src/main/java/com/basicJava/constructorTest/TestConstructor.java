package com.basicJava.constructorTest;

public class TestConstructor {

    public int i;
    public TestConstructor() {
        i = 10;
        System.out.println(i);
    }

    public TestConstructor(String name){
        System.out.println(name);

    }
    public void test1() {
        System.out.println(i);
    }
}
