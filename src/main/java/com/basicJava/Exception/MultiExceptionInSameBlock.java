package com.basicJava.Exception;

public class MultiExceptionInSameBlock {

    public static void main(String[] args) {
        try{
            int i=9/1;
            System.out.println("This is 1st try block");
            try {
                int j=7/0;

            }finally {
                System.out.println("Finally block");
            }
        }catch(ArithmeticException ae){
            System.out.println("Please correct your mistake");
        }catch (RuntimeException re){
            System.out.println( "RunTime exception ");
        }

    }
}
