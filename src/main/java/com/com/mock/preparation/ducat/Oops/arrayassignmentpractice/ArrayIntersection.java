package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayIntersection {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int a[] = new int[]{1, 2, 3, 4, 3, 4};
        int b[] = new int[]{4, 3, 5, 6};
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(b[j]);
                }

            }
        }

    }

}
