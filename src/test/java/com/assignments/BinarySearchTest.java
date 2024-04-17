package com.assignments;

import org.testng.annotations.Test;

import java.util.LinkedList;

public class BinarySearchTest {

    @Test
    public void test1() {
//        LinkedList<Integer> list = new LinkedList();
//
//        list.add(23);
//        list.add(12);
//        list.add(45);
//        list.add(83);
//        list.add(102);
//        list.add(49);
//        list.add(70);
//        System.out.println(list);

        int[] arr={23, 12, 45, 83, 102};

        int target = 12;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " is found at index: " + result);
        } else
            System.out.println("Element not found");
    }

    private int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                //left = mid + 1;
                right = mid - 1;
            } else{
                //right = mid - 1;
                left = mid + 1;
            }
        }

        return -1 ;
    }

}
