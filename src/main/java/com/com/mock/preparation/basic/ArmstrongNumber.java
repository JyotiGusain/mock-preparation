package com.mock.preparation.basic;

import java.util.Scanner;

public class ArmstrongNumber
    /*
    To find the Armstrong Number
     */

{
    public static void main(String[] args)
    {
        int number=0,temp,total=0;
        System.out.println("enetr the number");
        Scanner sc= new Scanner(System.in);
        number= sc.nextInt();

        //num= number;

        while(number!=0)
        {
            temp= number%10;
            total= temp*temp*temp;
        }
        if(total== number)
        {
            System.out.println("number is armstrong number");
        }
        else
        {
            System.out.println("number is not armstrong number");
        }

    }

}
