package com.basicJava.ConditionsAndLoops;

import com.basicJava.ArrayPractice.Arrays1;

import java.util.Arrays;

public class ForAndForeachLoop {
    public static void main(String[] args) {
        int[] a={56,68,97,84,76,12,34,25,76,26,86,54,72,93,85};

        Arrays.sort(a);

        for (int i = 0; i <=a.length-1 ; i++) {
             if (a[i] < 86)
             {
               continue;
                // break;
             }else {
                 System.out.print(a[i]+" ");
             }
        }
    }
}
