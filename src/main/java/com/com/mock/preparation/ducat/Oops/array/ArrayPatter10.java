package com.mock.preparation.ducat.Oops.array;

public class ArrayPatter10 {
    public static void main(String[] args) {
        boolean isStar = true;
        int k = 2;
        for (int i = 0; i < 5; i++) {
            if (isStar) {
                display("*");
                isStar = false;
                System.out.println();
            } else {
                display("" + k);
                k = k + 2;
                isStar = true;
                System.out.println();
            }
        }
    }

    private  static void display(String s) {
        for (int j = 0; j < 5; j++) {
            System.out.print(s);
        }
    }
}
