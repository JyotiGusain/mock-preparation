package com.mock.preparation.ducat.Oops.arrayassignment2;

public class Pattern7 {
    /*
    1 2 3 4 5
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9

     */
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j + i + " ");
                k++;
            }
            System.out.println();
        }
    }
}
