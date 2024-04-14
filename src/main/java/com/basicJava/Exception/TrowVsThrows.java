package com.basicJava.Exception;

public class TrowVsThrows {
    public static void main(String[] args) {
        sleep(1000);
        try {
            int i=7/0;
            System.out.println(i);
            //throw new ArithmeticException("Please check your calculation");
            //System.out.println("try block");

        }catch(ArithmeticException ae){
            System.out.println("catch block");
            System.exit(0);//method terminates JVM which results in termination of the currently running program
            throw new ArithmeticException("Please check your calculation");
        }

    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
