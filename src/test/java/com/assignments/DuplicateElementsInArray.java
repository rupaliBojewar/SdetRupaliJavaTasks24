package com.assignments;

public class DuplicateElementsInArray {
    public static void main(String[] args) {

        int[] array = {23, 65, 73, 23, 45, 65, 87, 23};
        int cnt;
        int no = 0;

        for (int i = 0; i < array.length; i++) {
            cnt = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                }
            }
            if (cnt > 1)
                System.out.println(array[i] + " is repeated for " + cnt + "times");

        }
    }

}
