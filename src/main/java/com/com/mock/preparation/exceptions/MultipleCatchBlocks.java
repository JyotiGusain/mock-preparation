package com.mock.preparation.exceptions;

/*
Program on Multiple catch blocks
 */
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int a[] = new int[8];
            a[9] = 3;
            /*
            Array has only 8 elements
             */
            a[4] = 20 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It is ArrayIndexOutOfBoundsException ");
        } catch (ArithmeticException e) {
            System.out.println("It is an arithematic expression");
        } catch (NullPointerException e) {
            System.out.println("Nullpointer exception");
        } catch (Exception e) {
            System.out.println("Warning");
        }
        System.out.println("This the last catch block");

    }
}
