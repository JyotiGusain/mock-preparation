package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int a[] = new int[]{46, 90, 23, 60, 11};
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            System.out.print(a[i] + " ");
        }


    }
}

class ArraySort2d {
    public static void main(String[] args) {
        int a[][] = new int[][]{{56, 43, 58, 24}, {213, 768, 2, 58}};
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}

