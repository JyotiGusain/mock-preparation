package com.mock.preparation.Ducat;

public class ArrayPattern12 {
    public static void main(String[] args) {
        /*
        1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int count = 0;
                count = count + 1;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
