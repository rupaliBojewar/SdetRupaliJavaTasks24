package com.assignments;

public class PrimeNo {
    public static void main(String[] args) {
        isPrimeNo(13);
    }
    static public void isPrimeNo(int a){
        int cnt=0;

        for (int i = 1; i <= a; i++) {

            if (a%i == 0)
                cnt++;
        }
        if (cnt==2)
            System.out.println("No "+a+" is Prime number");
        else
            System.out.println("No "+a+" is not Prime number");
    }
}
