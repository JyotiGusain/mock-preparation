package com.mock.preparation.ducat.Oops.arrayassignment2;

public class Pattern15 {
    /*
    A B C D E
    B C D E F
    C D E F G
    D E F G H
    E F G H I
     */

    public static void main(String[] args) {

        int alphabet = 64;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) (alphabet + i + j) + " ");
            }
            System.out.println();
        }

    }
}
