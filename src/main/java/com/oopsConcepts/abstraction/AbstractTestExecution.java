package com.oopsConcepts.abstraction;

public class AbstractTestExecution extends ImplementationClass {
    public static void main(String[] args){
        //AbstractClass ab=new AbstractClass();    Instance of abstract class is not possible

        ImplementationClass imp=new ImplementationClass();

        imp.test1();
        imp.test2();



        ImplementationClass imp2 =new AbstractTestExecution();
        imp2.test3();
    }
}
