package com.mock.preparation.exceptions;

/*
Program on Finally Block
 */
public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int num1 = 0;
            int num2 = 30 / 0;
            System.out.println(num2);
        } catch (ArithmeticException e) {
            System.out.println("Its a Arithmetic Exception");
        } finally {
            System.out.println("Try-Block-Finally Block");
        }
    }
}
