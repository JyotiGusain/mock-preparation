package com.mock.preparation.exceptions;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        try {
            String A = "Hello Java";
            /*
           charAt() method returns the character at the specified index in a com.mock.preparation.string.
             */
            char ch = A.charAt(25);
            System.out.println(ch);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("It is Index out of bound exception");
        }

    }
}
