package com.mock.preparation.ducat.string;

import java.util.Scanner;

public class CountDigitinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        char[] str1 = str.toCharArray();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str1[i])) {
                num++;

                System.out.println("Number of Digits: " + num);
            }

        }
    }

}
