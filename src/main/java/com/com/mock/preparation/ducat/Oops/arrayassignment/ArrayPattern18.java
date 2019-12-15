package com.mock.preparation.ducat.Oops.arrayassignment;

public class ArrayPattern18 {
    /*
    E D C B A
    E D C B A
    E D C B A
    E D C B A
    E D C B A

     */
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            for (int j = 5; j >= 1; j--) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

}
