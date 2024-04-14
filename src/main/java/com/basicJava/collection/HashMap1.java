package com.basicJava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<String ,Integer>();
        map.put("JAVA",11);
        map.put("Ruby",3);
        map.put("C++",20);
        map.put("JavaScript",3);
        map.put("C++",30);
        map.put(null, null);
        map.put(null, 12);
        System.out.println(map);//order of insertion is random.It allows one null key value .overrides the last key value
        System.out.println("***************************************************8");
        Map<String ,Integer> map1=new TreeMap<>();
        map1.put("JAVA",11);
        map1.put("Ruby",3);
        map1.put("C++",20);
        map1.put("JavaScript",3);
        map1.put("C++",30);
        //map1.put(null, null);
        map1.put("Python", 12);
        System.out.println(map1);//order of insertion is ascending order.It won,t allow null key value.overrides the last key value

    }
}
