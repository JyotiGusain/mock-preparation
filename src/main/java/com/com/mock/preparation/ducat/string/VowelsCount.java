package com.mock.preparation.ducat.string;

import java.util.Scanner;

/*
    Count number of vowels in a string

    enter the string: hello
    Number of vowels in a string: 2
 */
public class VowelsCount {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str1 = str.nextLine();
        str.close();

        int vcount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i'
                    || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                vcount++;
            }
        }
        System.out.print("Number of vowels in a string: " + vcount);
    }
}
