package com.assignments;

import org.testng.annotations.Test;

public class SortingOfArray {

    @Test
    public void bubbleSort() {
        int[] arr = {23, 34, 12, 8, 56, 90};
        int temp = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }


    }

    public void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            larr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i] = arr[mid + 1 + i];
        }

        int x = 0;
        int y = 0;
        int z = l;

        while (larr[x] < n1 && rarr[y] < n2) {
            if (larr[x] <= rarr[y]) {
                arr[z] = larr[x];
                x++;
            } else {
                arr[z] = larr[y];
                y++;
            }
            z++;
        }

        while (x < n1) {
            arr[z] = larr[x];
            x++;
            z++;
        }
        while (y < n2) {
            arr[z] = rarr[y];
            y++;
            z++;
        }

    }


    @Test
    public void mergeSortTest() {
        int[] arr = {23, 34, 12, 8, 56, 90};

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("");

        mergeSort(arr, 0, arr.length-1 );

        System.out.println("After Sorting Array is");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }


}

