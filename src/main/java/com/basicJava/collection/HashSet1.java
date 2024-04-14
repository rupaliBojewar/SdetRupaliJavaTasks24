package com.basicJava.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Java");
        set.add("C++ ");
        set.add("Ruby");
        set.add("JavaScript");
        set.add("Ruby");
        System.out.println(set);//Duplicates are not allowed and order is random

        System.out.println("*********************************************");

        SortedSet sset = new TreeSet();
        sset.add("Java1");
        sset.add("C++1 ");
        sset.add("Ruby1");
        sset.add("JavaScript1");
        sset.add("Ruby1");
        System.out.println(sset);//Duplicates are not allowed and order of insertion is ascending
    }
}
