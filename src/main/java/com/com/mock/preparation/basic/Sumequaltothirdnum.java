package com.mock.preparation.basic;

import java.util.Scanner;

public class Sumequaltothirdnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Sum of two numbers are: " + sum);
        System.out.println();


        if (num3 == sum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
