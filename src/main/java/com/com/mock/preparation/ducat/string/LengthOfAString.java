package com.mock.preparation.ducat.string;

import java.util.Scanner;

public class LengthOfAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("Length of the string is : " + str.length());

    }
}
