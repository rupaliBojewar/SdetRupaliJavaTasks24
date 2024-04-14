package com.methodsPractice;

public class MethodReturnType {

    public static void main(String[] args) {
        MethodReturnType mrt =new MethodReturnType();
        System.out.println(mrt.sum(12,23));
        System.out.print(mrt.sum1(10,23.1f));
    }

    public int sum(int a,int b){

        return a+b;
    }

    public double sum1(int a,float b){

        return a+b;
    }
}
