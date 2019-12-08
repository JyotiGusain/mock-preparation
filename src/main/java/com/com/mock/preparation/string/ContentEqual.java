package com.mock.preparation.string;

public class ContentEqual {
    public static void main(String[] args) {
        String s1 = "Tanishq";
        String s2 = "Bisht";
        StringBuffer s5 = new StringBuffer("Tanishq");
        StringBuffer s6 = new StringBuffer("Bisht");
        System.out.println(s1.contentEquals(s6));
        System.out.println(s2.contentEquals(s5));
        System.out.println(s1.contentEquals(s5));
        System.out.println(s2.contentEquals(s6));
    }
}
