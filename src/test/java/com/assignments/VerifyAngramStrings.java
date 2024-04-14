package com.assignments;

import com.basicJava.ArrayPractice.Arrays;

public class VerifyAngramStrings {
    public static void main(String[] args) {
        verifyAnagramStrings("rupali","paliru");
    }
    static public void verifyAnagramStrings(String str1,String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch2);
    }
}
