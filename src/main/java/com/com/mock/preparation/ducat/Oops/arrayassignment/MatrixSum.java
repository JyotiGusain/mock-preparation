package com.mock.preparation.ducat.Oops.arrayassignment;

public class MatrixSum {
    public static void main(String[] args) {
        int a[] = new int[]{3, 5, 4, 2, 1, 3, 5, 6};
        int b[] = new int[]{1, 3, 5, 7, 9, 2, 4, 5};
        for (int i = 0; i < 8; i++) {
            int c[] = new int[8];
            c[i] = a[i] + b[i];
            System.out.println("Sum of " + i + " index is: " + c[i]);


        }
    }
}
