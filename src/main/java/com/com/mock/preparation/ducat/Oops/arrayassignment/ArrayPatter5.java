package com.mock.preparation.ducat.Oops.arrayassignment;

public class ArrayPatter5 {
    public static void main(String[] args) {
        /*
        10101
        10101
        10101
        10101
        10101
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
