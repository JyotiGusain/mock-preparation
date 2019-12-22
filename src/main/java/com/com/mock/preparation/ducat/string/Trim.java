package com.mock.preparation.ducat.string;


/*
    By using Trim() we can check the unicode values befor and after the string.
    Before Trim:       Welcome Java
    21
    After Trim: Welcome Java
    12
    Before Trim: Hello world
    19
    After Trim: Hello world
    11

 */
public class Trim {
    public static void main(String[] args) {

        String s1 = "       Welcome Java  ";
        System.out.println("Before Trim:" + s1);
        System.out.println(s1.length());
        String s2 = s1.trim();
        System.out.print("After Trim: " + s2);
        System.out.print("\n" + s2.length());
        System.out.println();


        String s3 = "Hello world        ";
        System.out.println("Before Trim: " + s3);
        System.out.println(s3.length());
        String s4 = s3.trim();
        System.out.println("After Trim: " + s4);
        System.out.println(s4.length());


    }

}

