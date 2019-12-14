package com.mock.preparation.basic;

import java.util.Scanner;

public class AddDivMulSubRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num1, a, s, m, d, mod;
        System.out.println("Enter the num: ");
        num = scanner.nextInt();
        System.out.println("Enter the num1: ");
        num1 = scanner.nextInt();

        a = num + num1;
        System.out.println("Addition of num & num1 is: " + a);

        s = num - num1;
        System.out.println("Subtraction of num & num1 is: " + s);

        m = num * num1;
        System.out.println("Multiplication of num & num1 is: " + m);

        d = num / num1;
        System.out.println("Division of num & num1 is: " + d);

        mod = num % num1;
        System.out.println("Mod of num & num1 is: " + mod);

    }
}
