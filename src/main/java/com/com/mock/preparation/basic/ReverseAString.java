package com.mock.preparation.basic;

import java.util.Scanner;

public class ReverseAString {
    /*
    Reverse the string

    Enter the String: hello java
    The Reverse String is:  avaj olleh

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");

        char[] letters = scanner.nextLine().toCharArray();
        System.out.println("The Reverse String is: ");
        for (int i = letters.length - 1; i >= 0; i--)
            System.out.print(letters[i]);

    }
}
