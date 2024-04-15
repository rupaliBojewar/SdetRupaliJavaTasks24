package com.assignments;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);
        reverselist(list);
        System.out.println(list);
    }

    static public LinkedList reverselist(LinkedList ll) {
        LinkedList rll = new LinkedList();
        for (int i =ll.size()-1 ; i >=1; i--) {
            rll.addFirst(ll.get(i));
        }

        return ll;
    }
}
