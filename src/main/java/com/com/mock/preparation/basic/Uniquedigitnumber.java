package com.mock.preparation.basic;

public class Uniquedigitnumber {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++)
                    if (k != i && k != j && i != j) {
                        num = num + 1;
                        System.out.println(i + " " + j + " " + k);
                    }
            }
        }
        System.out.println("Enter the unique digit number: " + num);
    }
}
