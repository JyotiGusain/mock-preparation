package com.mock.preparation.ducat.Oops.arrayassignment;

import java.util.Scanner;

public class LCMArray {
    /*
    Find the LCM

    Please Enter the First Integer Value of Num1 : 3

     Please Enter the Second Integer Value of Num2 : 4

     GCD of 3 and 4  =  1

     LCM of 3 and 4  =  12

     */
    public static void main(String[] args) {

        int Num1, Num2, HCF = 0, LCM = 0;
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print(" Please Enter the  Integer Value of Num1 & Num2 : ");
        Num1 = sc.nextInt();
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