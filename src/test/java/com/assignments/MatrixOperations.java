package com.assignments;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
        int[][] b = {{11, 12, 13}, {21, 22, 23}, {13, 14, 12}};
        int[][] c = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                c[j][k] = a[j][k] - b[j][k];
                System.out.print(c[j][k] + " ");
            }
            System.out.println();
        }
    }

}
