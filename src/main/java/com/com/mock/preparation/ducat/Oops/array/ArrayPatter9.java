package com.mock.preparation.ducat.Oops.array;

public class ArrayPatter9 {
    public static void main(String[] args) {
        /*
             A B C D E
             A B C D E
             A B C D E
             A B C D E
             A B C D E
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((char) (j + 65) + " ");
            }
            System.out.println();
        }

    }
}
