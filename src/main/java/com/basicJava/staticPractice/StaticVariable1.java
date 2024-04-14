package com.basicJava.staticPractice;

public class StaticVariable1 {
    int empId;
    String empName;
    static String orgName="Apple";

    StaticVariable1(int id,String name){
        System.out.println("Emp_id:"+id);
        System.out.println("Emp_name:"+name);

    }
    public void test1(){

        System.out.println(StaticVariable1.orgName);
    }


    public static void main(String[] args) {
        orgName="Microsoft";
        new StaticVariable1(01,"Rupali");
        System.out.println("Org_name:"+orgName );
        //StaticVariable1 staticVariable1=new StaticVariable1(02,"ABC");
        new StaticVariable1(02,"ABC").test1();
    }
}
