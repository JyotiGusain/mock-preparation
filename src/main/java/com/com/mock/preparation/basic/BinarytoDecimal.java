package com.mock.preparation.basic;

import java.util.Scanner;

public class BinarytoDecimal {
    /*
    Enter the Binary Number: 1010
    The decimal number is: 10
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");

        int num = scanner.nextInt();

        int dec = 0, rem, pow = 1;
        {
            while (num != 0) {
                rem = num % 10;
                dec = dec + rem * pow;
                num = num / 10;
                pow = pow * 2;

            }
            System.out.println("The decimal number is: " + dec);
        }
    }
}
