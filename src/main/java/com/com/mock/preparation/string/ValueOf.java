package com.mock.preparation.string;

public class ValueOf {
    public static void main(String[] args) {
        double d = 123456.7890;
        boolean b = true;
        long l = 123456l;
        char ch[] = {'a', 'b', 'c', 'd'};
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(ch));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(b));
    }
}
