package com.mock.preparation.basic;

public class Numberdivisibleinarray {
    public static void main(String[] args) {

        int a[] = {5, 7, 9, 2, 4, 6, 10, 14, 15, 12, 34, 45, 67, 99};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.print("Number divisible by 3: ");
                System.out.println(a[i]);
            }

        }
    }
}
