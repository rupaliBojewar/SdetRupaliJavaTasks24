package com.basicJava.ArrayPractice;

public class WrapperClass {
    public static void main(String[] args) {

        test1();
        test2();

        int a = 56;
        Integer i = new Integer(32);

        String s = "100";
        String s1 = "40.89";

        System.out.println(Integer.valueOf(s));
        System.out.println(Integer.parseInt(s));

        System.out.println(Double.valueOf(s1));

        System.out.println(a);

    }

    public static void test1() {
        String price = "$50";
        String originalPrice = price.replace("$", "");
        int tax = 30;

        int Total = Integer.parseInt(originalPrice) + tax;
        System.out.println(Total);
    }

    public static void test2() {
        String price = "$50";
        String originalPrice = price.replace("$", "");
        int tax = 30;

        int Total = Integer.valueOf(originalPrice) + tax;
        System.out.println(Total);
    }
}

