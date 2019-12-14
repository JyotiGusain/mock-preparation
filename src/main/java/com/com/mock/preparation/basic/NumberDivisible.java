package com.mock.preparation.basic;

public class NumberDivisible {
    public static void main(String[] args) {
        System.out.print("Number divisible by 3: ");
        {
            for (int i = 1; i <= 50; i++)
                if (i % 3 == 0) {
                    System.out.println(i + " ");
                }
        }

        System.out.print("Number divisible by 5: ");
        {
            for (int j = 1; j <= 50; j++)
                if (j % 5 == 0) {
                    System.out.println(j + " ");
                }
        }

        System.out.print("Number divisible by 3 & 5: ");
        {
            for (int i = 1; i <= 50; i++)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " ");
                }


        }
    }
}
