package com.assignments;

public class FibonacciSeries {
    public static void main(String[] args) {
        int x=0,y=1,temp=0,no=8;

        //System.out.print(x+" ");

        for (int i = 0; i < no ; i++) {
            y=x+y;
            System.out.print(y+" ");
            temp=x;
            x=y;
            y=temp;

        }

    }


}
