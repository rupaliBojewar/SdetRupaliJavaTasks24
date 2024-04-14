package com.assignments;

import org.testng.annotations.Test;

public class Plindrome {

    @Test
    public void verifyPalindromeString() {

        String str = "Rupalilapur";
        char[] stringChar = str.toCharArray();
        String reverseString="";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseString=reverseString+stringChar[i];
        }
        System.out.println(reverseString);

        if(str.equalsIgnoreCase(reverseString))
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given String is not palindrome");


    }
}
