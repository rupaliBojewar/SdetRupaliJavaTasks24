package com.basicJava.strings;

public class ComparisionOfString {
    public static void main(String[] args) {
        String s1="Selenium";
        String s2="Tool";
        String s3="Playwrite Automation Tool";
        String s4="Automation";
        String s5="automation";
        String s6="Selenium Automation Tool";

        System.out.println(s1.contains(s2));//false

        System.out.println(s4.equals(s5));//false
        System.out.println(s4.equalsIgnoreCase(s5));//true
        System.out.println(s6.startsWith(s1));//true
        System.out.println(s3.endsWith(s2));//true
        System.out.println(s4.trim());//trim the space

        System.out.println("***************************");
        String web = "Selenium";
        String web1 = "Selenium";

        String webTool = new String("Selenium");
        String webTool1 = new String("Selenium");

        System.out.println(web==web1);//true
        System.out.println(web.equals(web1));//true

        System.out.println(webTool==webTool1);//false
        System.out.println(webTool.equals(webTool1));//true



    }

}
