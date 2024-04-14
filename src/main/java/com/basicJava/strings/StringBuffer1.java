package com.basicJava.strings;

public class StringBuffer1 {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Automation");
        StringBuffer sb1=new StringBuffer("Automation");


        sb.append("Tool");
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.compareTo(sb1));

        sb.insert(0,"Selenium");
        System.out.println(sb);

        System.out.println(sb.reverse());

    }
}
