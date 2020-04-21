package com.mock.preparation.string;

/*
String Builder Performance
Time taken by String Builder 1ms

String Buffer Performance
Time taken by String Buffer 2ms

 */
public class PerformanceOfStringBuilderAndStringBuffer {
    public static void main(String[] args) {

        long stime = System.currentTimeMillis();
        System.out.println("String Builder Performance");
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        //System.out.println(stringBuilder);
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("Java");
        }
        System.out.println("Time taken by String Builder " + (System.currentTimeMillis() - stime) + "ms");

        System.out.println();

        stime = System.currentTimeMillis();
        System.out.println("String Buffer Performance");
        StringBuffer stringBuffer = new StringBuffer("Welcome");
        //System.out.println(stringBuffer);
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("Java");
        }
        System.out.println("Time taken by String Buffer " + (System.currentTimeMillis() - stime) + "ms");

    }
}
