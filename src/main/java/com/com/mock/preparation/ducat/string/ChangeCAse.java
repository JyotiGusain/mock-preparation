package com.mock.preparation.ducat.string;

public class ChangeCAse {
    public static void main(String[] args) {
        System.out.println("Entered String is: InDIa");
        String s1 = "I";
        String s2 = "n";
        String s3 = "D";
        String s4 = "I";
        String s5 = "a";
        String s11 = (s1).toLowerCase();
        String s12 = (s2).toUpperCase();
        String s13 = (s3).toLowerCase();
        String s14 = (s4).toLowerCase();
        String s15 = (s5).toUpperCase();


        String s8 = s11.concat(s12).concat(s13).concat(s14).concat(s15);
        System.out.println("Print the String: " + s8);

    }
}
