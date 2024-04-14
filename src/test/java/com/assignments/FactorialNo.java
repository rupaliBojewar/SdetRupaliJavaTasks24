package com.assignments;

public class FactorialNo {
    public static void main(String[] args) {

        int a = 4;
        System.out.println("Factorial of number " + a + " is ::" + factorialNo(a));
    }

    static public int factorialNo(int i) {
        int factNum = 1;

        for (int j = 1; j <= i; j++) {
            factNum = factNum * j;
        }
        return factNum;
    }
}
