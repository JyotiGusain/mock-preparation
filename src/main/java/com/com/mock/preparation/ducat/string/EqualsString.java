package com.mock.preparation.ducat.string;

import java.util.Scanner;

/*
 Find whether the String are equal or not

 case1:
    Enter the first String:
    HELLO
    Enter the second String:
    HELLO
    HELLO equals HELLO is : true

    case2:
    Enter the first String:
    heloo
    Enter the second String:
    HELOO
    heloo equals HELOO is : false
 */
public class EqualsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str = scanner.nextLine();
        System.out.println("Enter the second String: ");
        String str1 = scanner.nextLine();

        boolean str2 = str.equals(str1);
        System.out.println(str + " equals " + str1 + " is : " + str2);

        /* String str="Hello to the world of java";
        String str1="hello To the World of JAVA";
        boolean str2=str.equals(str1);
        System.out.println(str2);*/
    }
}
