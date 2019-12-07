package com.mock.preparation.Ducat;

public class ArrayPattern11 {
    public static void main(String[] args) {
        /*
            5 4 3 2 1
            6 5 4 3 2
            7 6 5 4 3
            8 7 6 5 4
            9 8 7 6 5

         */
        int k = 0;
        for (int i = 5; i <= 9; i++) {
            for (int j = i; j >= k + 1; j--) {
                System.out.print(j + " ");
            }
            k++;
            System.out.println();
        }
    }
}
