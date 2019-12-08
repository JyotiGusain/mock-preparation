package com.mock.preparation.exceptions;

/*
Program of Exception Handling on Arithmatic Exception
 */
public class ArithmaticException {
    public static void main(String[] args) {
        int number1, number2;
        try {
            number1 = 0;
            number2 = 23 / number1;
            System.out.println(number2);
        } catch (ArithmeticException e) {
            System.out.println("Number can't be divided by zero");
        }


    }
}
