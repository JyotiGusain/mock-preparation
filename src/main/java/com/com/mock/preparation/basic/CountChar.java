package com.mock.preparation.basic;

public class CountChar {
    public static void main(String[] args) {
        String string = "Hello to the java world 1@23$ 34643 $%#^3456";
        count(string);
    }

    public static void count(String s) {
        char[] ch = s.toCharArray();
        int letter = 0;
        int num = 0;
        int space = 0;
        int othercharacter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                othercharacter++;
            }
        }
        System.out.println("Hello to the java world 1@23$ 34643 $%#^3456");
        System.out.println(" Letters " + letter);
        System.out.println(" Number " + num);
        System.out.println(" Space " + space);
        System.out.println(" Other " + othercharacter);

    }
}
