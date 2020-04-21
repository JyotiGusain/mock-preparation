package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayMaximimandMinimum2d {
    public static void main(String[] args) {
        int[][] a = {{12, 23, 1, 45}, {21, 56, 22, 78}};
        int max = a[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println("Maximum number is: " + max);
        }
    }
}

class ArrayMinimum2d {
    public static void main(String[] args) {
        int a[][] = new int[][]{{23, 45, 12, 56, 78}, {67, 37, 89, 0, 7}};
        int min = a[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] < min)
                    min = a[i][j];
            }
            System.out.println("Minimum number is: " + min);
        }

    }
}