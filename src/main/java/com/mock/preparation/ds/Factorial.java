package com.mock.preparation.ds;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
class to find  a factorial of given number. There 2 implementation
1. using loop
 2- using recursion
 */
public class Factorial {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the no for which you want to compute the factorial");
            int num = scanner.nextInt();

            //using loop
          int factorial1 =   factorialUsingLoop(num);
            System.out.println("factorial of given number: "+num+" using loop is: "+factorial1);

            //using recursion
           int factorial2 = factorialUsingRecursion(num);
            System.out.println("factorial of given number: " + num + " using recursion is: " + factorial2);

        }
        catch (InputMismatchException e){
            System.out.println("The input number is not numeric, please enter the integer");
        }
    }

    private static int factorialUsingLoop(int num) {
        int fact =1;
        for(int i=num;i>= 1;i--){
            fact = fact*i;
        }
        return fact;
    }

    private static int factorialUsingRecursion(int num) {
        if(num ==1){
            return 1;
        }
        return num * factorialUsingRecursion(num-1);
    }
}
