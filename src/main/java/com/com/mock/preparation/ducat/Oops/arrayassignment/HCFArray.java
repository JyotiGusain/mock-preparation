package com.mock.preparation.ducat.Oops.arrayassignment;

import java.util.Scanner;

public class HCFArray {
    /*
    Find the HCF

    enter the interger value of a:
    60
    enter the interger value of b:
    72
    HCF of 60 and 72 is 12

     */
    public static void main(String[] args) {
        int a, b, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the interger value of a: ");
        a = sc.nextInt();
        System.out.println("enter the interger value of b: ");
        b = sc.nextInt();

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }
}

