package com.mock.preparation.ducat.Oops.arrayassignment;

import java.util.Scanner;

public class LCMArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1, Num2, HCF = 0, LCM = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the First Integer Value : ");
        Num1 = sc.nextInt();

        System.out.print(" Please Enter the Second Integer Value : ");
        Num2 = sc.nextInt();

        int a = Num1;
        int b = Num2;

        while (Num2 != 0) {
            if (Num1 > Num2) {
                Num1 = Num1 - Num2;
            } else {
                Num2 = Num2 - Num1;
            }
        }
        HCF = Num1;
        System.out.println("\n GCD of " + a + " and " + b + "  =  " + HCF);

        LCM = (a * b) / HCF;
        System.out.println("\n LCM of " + a + " and " + b + "  =  " + LCM);
    }
}