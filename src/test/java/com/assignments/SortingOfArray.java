package com.assignments;

import org.testng.annotations.Test;

public class SortingOfArray {

    @Test
    public void bubbleSort() {
        int[] arr = {23, 34, 12, 8, 56, 90};
        int temp = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}

