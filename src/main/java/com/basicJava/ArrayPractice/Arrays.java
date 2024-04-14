package com.basicJava.ArrayPractice;

public class Arrays {

    static int a;
    static String str1;
    static char c1;

    public static void main(String[] args) {
        //test1();
        test2();

        int[] i={1,4,5,9,3,5,9};

        int[] j = new int[]{1,2,3,4};

        System.out.println(a);
        System.out.println(str1);
        System.out.println(c1);

        Arrays arrays=new Arrays();

        System.out.println(arrays.a);
        System.out.println(arrays.str1);
        System.out.println(arrays.c1);
    }

    public static void test1(){
        int[] i={43,76,45,23,98};
        for (int j = 0; j < i.length; j=j+2) {
            System.out.println(i[j]);
        }

    }
    public static void test2(){
        String[] str ={"one","two","three"};

        for (String s: str
             ) {
            System.out.println(s);
        }

    }
}
