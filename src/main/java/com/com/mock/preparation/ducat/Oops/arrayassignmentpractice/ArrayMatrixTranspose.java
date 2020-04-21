package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayMatrixTranspose {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 2, 3, 4}, {5, 6, 7, 8}};
        int transpose[][] = new int[4][4];
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                transpose[i][j] = a[j][i];
            }
        }
        System.out.println("Without Transpose");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("With Transpose");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

        }
    }
}