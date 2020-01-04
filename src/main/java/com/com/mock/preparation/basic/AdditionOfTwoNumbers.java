package com.mock.preparation.basic;

import java.util.Scanner;
/*
Addition Of Two Numbers using Scanner class
 */
public class AdditionOfTwoNumbers
{
    public static void main(String[] args)
    {
        /*
        Scanner class is used to get user input
         */
        Scanner s = new Scanner(System.in);
        int number1, number2, sum;
        System.out.println("Enter the value of number1:");
        /*
        nextInt() is a method of the object s of the Scanner class
         */
        number1=s.nextInt();
        System.out.println("Enter the value of number2:");
        number2=s.nextInt();

        sum=number1+number2;
        System.out.println("Sum of two numbers are:"+sum);

    }
}
