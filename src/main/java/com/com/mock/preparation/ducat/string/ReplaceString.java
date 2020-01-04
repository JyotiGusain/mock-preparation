package com.mock.preparation.ducat.string;

/*
String Replace


Replace String of Welcome is: Hellome
Replace String of (world) in Welcome to the world of java is: Welcome to the word of java

 */
public class ReplaceString {
    public static void main(String[] args) {
        String str = "Welcome to the world of java";
        String str1 = "Welcome";

        String str2 = str.replace("world", "word");
        String str3 = str1.replace("Welc", "Hell");
        System.out.println("Replace String of Welcome is: " + str3);
        System.out.println("Replace String of (world) in " + str + " is: " + str2);

    }
}
