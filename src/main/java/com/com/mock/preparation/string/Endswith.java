package com.mock.preparation.string;

public class Endswith {
    public static void main(String[] args) {
        String s = "hello world java ";
        boolean retval;
        retval = s.endsWith("world");
        retval = s.endsWith("hello");
        System.out.println(retval);
    }
}
