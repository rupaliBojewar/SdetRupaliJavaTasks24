package com.basicJava.Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
            System.out.println(i);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Close db");
        }

    }


}
