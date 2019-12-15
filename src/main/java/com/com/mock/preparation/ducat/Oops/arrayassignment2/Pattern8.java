package com.mock.preparation.ducat.Oops.arrayassignment2;

public class Pattern8 {
    /*
    A B C D E
    A B C D E
    A B C D E
    A B C D E
    A B C D E
     */
    public static void main(String[] args) {
        int k = 0;
        int alphabet = 64;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) (alphabet + j) + " ");
                k++;
            }
            System.out.println();
        }
    }
}
