package com.mock.preparation.ducat.string;

import java.util.Scanner;

/*
    Reverse the String

    Enter the String: abcde

    The Reverse String is:
    edcba

 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string :");

        char[] ch = scanner.nextLine().toCharArray();
        System.out.print(" Reverse the String: ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }
}
