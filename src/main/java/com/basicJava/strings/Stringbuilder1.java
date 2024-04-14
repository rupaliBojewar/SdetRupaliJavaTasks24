package com.basicJava.strings;

public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Automation");
        StringBuilder sb1=new StringBuilder("Automation");


        sb.append("Tool");
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.compareTo(sb1));

        sb.insert(0,"Selenium");
        System.out.println(sb);

        System.out.println(sb.reverse());

    }
}


