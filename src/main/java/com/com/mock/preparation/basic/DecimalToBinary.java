package com.mock.preparation.basic;

import java.util.Scanner;

public class DecimalToBinary {
   /*
   Convert a decimal number to binary number


   Enter the decimal number: 5
    101
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = scanner.nextInt();

        int[] rem = new int[10];
        int index = 0;
        while (num != 0) {
            rem[index] = num % 2;
            index++;

            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(rem[i]);
        }
    }
}
