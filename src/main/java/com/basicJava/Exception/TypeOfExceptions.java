package com.basicJava.Exception;

import java.io.File;

public class TypeOfExceptions {
    public static void main(String[] args) {





    }

    public void stringIndexOutOfBoundsException() {
        try {

            String s = "Selenium";
            //char[] ch = s.toCharArray();
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    public void arrayIndexOutOfBoundsException() {

        try {
            int ch[] = {9, 0, 6, 3, 5, 7, 2, 3, 44};
            System.out.println(ch[10]);

        } catch (ArrayIndexOutOfBoundsException aob) {
            aob.printStackTrace();
        }
    }

    public void nullPointerException(){
        try {
            String str[] = null;
            System.out.println(str.length);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            System.out.println("String value is null");
        }

    }
}
