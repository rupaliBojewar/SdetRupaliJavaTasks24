package com.assignments;

import org.testng.annotations.Test;

public class Assignment1 {

    @Test
    public void getHighestNoOfArray1() {
        int[] a = {23, 67, 98, 45, 67, 94, 100};
        int highestNo = 0;

        for (int i = 0; i < a.length; i++) {
            highestNo = Math.max(a[i], highestNo);
        }
        System.out.println("HighestNo is " + highestNo);
    }


    @Test
    public void getHighestNoOfArray2() {
        int[] a = {23, 67, 98, 45, 67, 94, 100};
        int highestNo = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    highestNo = a[j];
                    a[j] = a[i];
                    a[i] = highestNo;
                }
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println("HighestNo is " + a[0]);
    }

    @Test
    public void getHighestNoOfArray3() {
        int[] a = {23, 67, 98, 45, 67, 94, 100};
        int highestNo = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highestNo)
                highestNo = a[i];
        }
        System.out.println("Highest no.is " + highestNo);
    }

    @Test
    public void secondHighestValueFromArray() {
        int[] a = {23, 67, 98, 45, 67, 94, 100};
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println("2nd Highest no. is " + a[1]);
    }

    @Test
    public void reverseSubstring() {
        String str = "Hello World I love Selenium";
        String[] str1 = str.split(" ");

        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }
    }
}

