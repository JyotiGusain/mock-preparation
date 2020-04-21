package com.mock.preparation.string;

public class Copyvalueof {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'O', 'w', 'O', 'r', 'l', 'd'};
        String str2;
        str2 = String.copyValueOf(str);
        System.out.println(str);

        str2 = String.copyValueOf(str, 3, 5);
        System.out.println(str2);
    }
}
