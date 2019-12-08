package com.mock.preparation.exceptions;

public class FinallyandReturn {
    public static void main(String[] args) {
        System.out.println((FinallyandReturn.myMethod()));

    }

    public static int myMethod() {
        try {
            return 0;
        } finally {
            System.out.println("This is finally block");
            System.out.println("Finally block");
        }
    }
}
