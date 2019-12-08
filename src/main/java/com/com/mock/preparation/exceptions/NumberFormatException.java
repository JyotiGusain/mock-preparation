package com.mock.preparation.exceptions;

/*
Program on Number Format Exception
 */
public class NumberFormatException {
    public static void main(String[] args) {
        try {
            /*
            parseint() is used to convert com.mock.preparation.string to integer
             */
            int num = Integer.parseInt("HELLO");
            System.out.println(num);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Number Format Exception");
        }


    }
}
