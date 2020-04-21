package com.mock.preparation.string;

public class CompareIgnorecase {
    public static void main(String[] args) {
        String s = "String is immutable";
        String s2 = "string is immutable";
        String s3 = "Integers are immutable";

        int s4 = s.compareToIgnoreCase(s2);
        System.out.println(s4);
        int s5 = s.compareToIgnoreCase(s3);
        System.out.println(s5);
        int s6 = s2.compareToIgnoreCase(s3);
        System.out.println(s6);

    }
}
