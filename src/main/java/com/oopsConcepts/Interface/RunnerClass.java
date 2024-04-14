package com.oopsConcepts.Interface;

import com.oopsConcepts.abstraction.ImplementationClass;

public class RunnerClass {
    public static void main(String[] args) {


        //Interface3 intr =new Interface3(); can not creat the istance of Interface.

        ImplementationClass imp =new ImplementationClass();
        imp.test1();
        imp.test2();
        imp.test3();


    }
}
