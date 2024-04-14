package com.basicJava.ArrayPractice;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{2,3,4,5},{11,12,13,14,15},{21,22,23,24}};

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k <4 ; k++) {
                System.out.print(a[j][k]+" ");
            }
            System.out.println();
        }

        System.out.println("*****************");
        for (int[] c:a) {
            for (int d:c) {
                System.out.print(d+" ");
            }
            System.out.println(" ");
        }
    }
}
