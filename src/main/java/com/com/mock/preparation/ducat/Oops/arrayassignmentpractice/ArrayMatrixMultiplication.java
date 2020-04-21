package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayMatrixMultiplication {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {10, 2, 7, 4}};
        int b[][] = {{1, 11, 3, 4}, {16, 10, 3, 4}, {6, 2, 9, 4}, {3, 2, 3, 8}};
        int c[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }
}