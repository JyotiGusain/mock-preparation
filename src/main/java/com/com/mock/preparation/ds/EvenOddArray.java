package com.mock.preparation.ds;

public class EvenOddArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 5, 7, 6};
        System.out.println("Even numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd Numbers");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }

}
