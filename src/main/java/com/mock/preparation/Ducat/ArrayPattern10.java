package com.mock.preparation.Ducat;

public class ArrayPattern10 {
    public static void main(String[] args) {

        /*
            1 1 1 1 1
            0 0 0 0 0
            1 1 1 1 1
            0 0 0 0 0
            1 1 1 1 1

         */
        int k = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= k + 5; j++)
                if (i % 2 != 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            k++;
            System.out.println();
        }
    }
}
