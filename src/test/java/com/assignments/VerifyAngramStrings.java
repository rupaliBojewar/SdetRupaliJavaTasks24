package com.assignments;

import java.util.Arrays;

public class VerifyAngramStrings {
    public static void main(String[] args) {
        verifyAnagramStrings("rupali","palirt");
    }
    static public void verifyAnagramStrings(String str1,String str2){
        int cnt=0;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]!=ch2[i])
                cnt++;
        }
        if (cnt>0)
            System.out.println("Strings are not Anagram");
        else
            System.out.println("Strings are Anagram");
    }
}
