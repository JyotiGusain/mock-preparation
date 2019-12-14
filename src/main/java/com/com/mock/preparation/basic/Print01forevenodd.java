package com.mock.preparation.basic;

import java.util.Scanner;

public class Print01forevenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            System.out.println(0);//if odd then print 0
        } else {
            System.out.println(1);//if even then print 1
        }
    }
}
