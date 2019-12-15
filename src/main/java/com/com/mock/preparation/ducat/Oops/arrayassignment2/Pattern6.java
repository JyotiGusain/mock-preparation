package com.mock.preparation.ducat.Oops.arrayassignment2;

public class Pattern6 {
    /*
        11111
        00000
        11111
        00000
        11111
     */
    public static void main(String[] args) {
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
