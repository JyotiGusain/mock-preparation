package com.mock.preparation.exceptions;

public class ExceptionHandling {
    public static void main(String[] s) {
        try {
            int x = 10 / s.length;
            System.out.println(x);
            int z[] = new int[s.length];
            z[10] = 100;
        } catch (ArithmeticException e) {
            System.out.println("This is an Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is also an exception");
        } catch (Exception e) {
            System.out.println("Now i am out of the exception");
        }

    }
}