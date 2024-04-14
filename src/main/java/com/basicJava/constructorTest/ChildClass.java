package com.basicJava.constructorTest;

public class ChildClass extends ParentClass {
    public ChildClass() {
        //System.out.println();
        super();//it will call parent constructor.And it should be first statement in class constructor
    }

    public static void main(String[] args) {

        ChildClass ch=new ChildClass();


        TestConstructor tst = new TestConstructor("hyd");
        tst.test1();
        EmployeeDetails emp =new EmployeeDetails("Rupali","Hyderabad");


    }
}
