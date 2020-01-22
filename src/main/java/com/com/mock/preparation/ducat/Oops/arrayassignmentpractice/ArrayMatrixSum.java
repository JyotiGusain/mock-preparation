package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

/*
        Matrix of a
        1  2  3
        1  2  3
        1  2  3
        matrix of b
        1  2  3
        1  2  3
        1  2  3
        Matrix of c
        2  4  6
        2  4  6
        2  4  6
  */
public class ArrayMatrixSum {
    public static void main(String[] args) {
        int c[][] = new int[3][3];
        int i = 0, j = 0;
        int a[][] = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int b[][] = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        System.out.println("Matrix of a");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("matrix of b");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Matrix of c");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

