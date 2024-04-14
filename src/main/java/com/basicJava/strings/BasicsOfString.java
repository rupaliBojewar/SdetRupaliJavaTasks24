package com.basicJava.strings;

public class BasicsOfString {
    public static void main(String[] args) {
        String str = null;//memory allocates in pool area
        String str1=new String("Selenium");//memory allocates in heap area (every time new memory allocation )

        System.out.println("Tool name is "+str);
        System.out.println("tool name is "+ str1+" Automation");

        System.out.println(new BasicsOfString());

        String webTool="PlayWrite";
        webTool.concat("Automation Tool");//String class is immutable we can not add or remove string from original string
        System.out.println(webTool);//PlayWrite

        String webTool1=webTool.concat(" Automation Tool");
        System.out.println(webTool1);//Play WriteAutomation Tool

        String price="100";
        System.out.println(Integer.parseInt(price));

        String price1="$600";
        System.out.println(price1.substring(1));

        String price2="7678902JHSASFJSHghsekjfsjk#@$$^&*&%";

        System.out.println(price2.replaceAll("[^0-9]",""));//7678902
        System.out.println(price2.replaceAll("[^A-Z]",""));//JHSASFJSH
        System.out.println(price2.replaceAll("[^a-z]",""));//ghsekjfsjk
        System.out.println(price2.replaceAll("[^0-9,a-z,A-Z]",""));//7678902JHSASFJSHghsekjfsjk
        System.out.println(price2.replaceAll("[0-9,a-z,A-Z]",""));//#@$$^&*&%

        System.out.println(price2.length());

        String msg="Welcome to training program and $10k payment";
        int index1=msg.indexOf("$");
        System.out.println(index1);
        int index2=msg.indexOf("k");
        System.out.println(index2);
        System.out.println(msg.substring(index1+1,index2));
        System.out.println(msg.charAt(index1));






    }
}
