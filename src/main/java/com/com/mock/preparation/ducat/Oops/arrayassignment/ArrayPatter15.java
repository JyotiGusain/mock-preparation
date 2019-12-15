package com.mock.preparation.ducat.Oops.arrayassignment;

public class ArrayPatter15 {
    public static void main(String[] args) {
        /*
        ABCDE
        BCDEF
        CDEFG
        DEFGH
        EFGHI
         */
        for (int i = 0; i < 5; i++) {
            int alphabet = 65;
            for (int j = 0; j < 5; j++) {
                System.out.print((char) (alphabet + i + j));
            }
            System.out.println();


        }
    }
}
