package com.basicJava.Conditions;

public class IfElseCondition {

    public static void main(String[] args) {

        IfElseCondition ifc = new IfElseCondition();

        int value = ifc.case1(4);
        if (value==1){
            System.out.println("Condition 1 is successful");
        } else if (value == 2) {
            System.out.println("Condition 2 is successful");
        } else if (value == 3) {
            System.out.println("Condition 3 is successful");
        } else if (value == 4) {
            System.out.println("Condition 4 is successful");
        }


    }

    public int case1(int a) {
        return a;
    }
}
