package com.basicJava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("Selenium");
        list.add("Playwright");
        list.add("WebdriverIO");
        System.out.println(list);



        ArrayList arrayList=new ArrayList();

        arrayList.add(20);
        arrayList.add(54);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(20);
        Collections.sort(arrayList);

        Iterator itr =arrayList.iterator();
        //System.out.println(arrayList);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
