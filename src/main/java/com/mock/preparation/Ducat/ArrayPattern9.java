package com.mock.preparation.Ducat;

public class ArrayPattern9 {
    public static void main(String[] args) {
        /*
            1 2 3 4 5
            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
            5 6 7 8 9

         */
        int k = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= k + 5; j++) {
                System.out.print(j + " ");
            }
            k++;
            System.out.println();
        }
    }
}
