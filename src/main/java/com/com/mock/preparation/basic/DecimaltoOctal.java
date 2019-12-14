package com.mock.preparation.basic;

import java.util.Scanner;

public class DecimaltoOctal {

    /*
    Convert Decimal Number to Octal Number

    Enter the decimal number: 20
    24
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num = scanner.nextInt();

        int[] rem = new int[10];
        int index = 0;
        while (num != 0) {
            rem[index] = num % 8;
            index++;

            num = num / 8;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(rem[i]);
        }
    }
}

