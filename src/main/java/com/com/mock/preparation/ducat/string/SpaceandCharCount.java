package com.mock.preparation.ducat.string;
/*
    Count number of spaces and character in a string

    Hello to the world of Java

    Char count 21
    Space count 5

 */

public class SpaceandCharCount {
    public static void main(String[] args) {
        String string = "Hello to the world of Java";
        count(string);

    }

    public static void count(String s) {
        char ch[] = s.toCharArray();
        int space = 0;
        int letter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(ch[i])) {
                space++;
            } else if (Character.isLetter(ch[i])) {
                letter++;
            }
        }

        System.out.println("Hello to the world of Java\n");
        System.out.println("Char count " + letter);
        System.out.println("Space count " + space);
    }


}
