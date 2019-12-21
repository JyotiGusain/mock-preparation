package com.mock.preparation.ducat.Oops.arrayassignment;

import java.util.Arrays;

public class Sorting2dArray {
    public static void main(String[] args) {
        int a[][] = new int[][]{{3, 5, 2, 1}, {4, 6, 8, 9}};

        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
