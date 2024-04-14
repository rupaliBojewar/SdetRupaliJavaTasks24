package com.basicJava.Exception;

public class BasicException {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Software Test");
    }
    public void test1(){
        System.out.println("This is test1");
    }
}
