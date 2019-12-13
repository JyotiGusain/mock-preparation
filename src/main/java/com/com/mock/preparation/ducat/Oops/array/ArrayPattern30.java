package com.mock.preparation.ducat.Oops.array;

public class ArrayPattern30 {
    /*
    A
    A  B
    A  B  C
    A  B  C  D
    A  B  C  D  E
     */

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 65) + "  ");
            }
            System.out.println();
        }

    }
}
