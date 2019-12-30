package com.mock.preparation.ducat.string;

import java.util.Scanner;

/*
Comparing of both the String

case1:
Enter the first string: hello
Enter the second String: hello
hello compareTo hello is: 0
(In case 1 if we use compareTo() method to compare both string we got 0,
this is because both the strings ASCII value is same.)

case2:
Enter the first string: World
Enter the second String: world
World compareTo world is: -32
(In case 2 if we use compareTo() method to compare both string we got -32,
this is because both the strings ASCII value has a diifernce of -32)
eg:ASCII value of W is 87
   ASCII value of w is 119
   Differnce of both the value is -32( 87- 119)


 */
public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the second String: ");
        String str1 = scanner.nextLine();

        int str2 = str.compareTo(str1);
        System.out.println(str + " compareTo " + str1 + " is: " + str2);
    }

}

