package com.mock.preparation.string;

public class GetChar {
    public static void main(String[] args) {
        String s1 = "WELCOME TO  hello THE WORLD OF JAVA";
        int start = 12;
        int end = 16;
        char a[] = new char[end - start];
        s1.getChars(start, end, a, 0);
        System.out.println(a);

    }
}
