package com.mock.preparation.string;

public class EqualEqualIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Hello java";
        String s2 = "welcome";
        String s3 = "hello JAVA";
        String s4 = "hello JAVA";
        System.out.println(s1 + " equals " + s3 + " -->  " + s1.equals(s3));
        System.out.println(s2 + " equals " + s3 + " --> " + s2.equals(s3));
        System.out.println(s4 + " equals " + s3 + " --> " + s4.equals(s3));
        System.out.println(s4.equalsIgnoreCase(s3));
        System.out.println(s4.equalsIgnoreCase(s2));


    }
}
