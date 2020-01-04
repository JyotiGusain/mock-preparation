package com.mock.preparation.ducat.Oops.arrayassignment;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] a = new int[][]{{4, 2, 7}, {3, 6, 2}, {3, 5, 6}};
        int transpose[][] = new int[3][3];
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
        }
        System.out.println("Print Matrix without transpose:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Print Matrix with transpose: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }
    }
}


