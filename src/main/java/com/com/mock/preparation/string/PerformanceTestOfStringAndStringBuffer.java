package com.mock.preparation.string;
/*
Time taken by Concatinating with String 1082ms
Time taken by Concatinating with StringBuffer 4ms

 */

public class PerformanceTestOfStringAndStringBuffer {
    public static String concatWithString() {
        String s = "WElcome";
        for (int i = 0; i < 10000; i++) {
            s = s + "JAVA";
        }
        return s;
    }


    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Welcome");
        for (int j = 0; j < 10000; j++) {
            sb = sb.append("Java");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        concatWithString();
        System.out.println("Time taken by Concatinating with String " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concatinating with StringBuffer " + (System.currentTimeMillis() - startTime) + "ms");

    }
}
