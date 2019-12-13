package com.mock.preparation.ducat.Oops.array;

public class ArrayPattern26 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
                k++;
            }
            System.out.println();
        }
    }
}
