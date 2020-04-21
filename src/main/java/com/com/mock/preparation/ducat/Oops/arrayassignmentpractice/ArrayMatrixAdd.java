package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayMatrixAdd {
    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 3, 2, 4}, {2, 3, 4, 5}};
        int b[][] = new int[][]{{7, 6, 5, 1}, {2, 5, 6, 4}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                int c = a[i][j] + b[i][j];
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}