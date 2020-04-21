package com.mock.preparation.ducat.string;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String rev = stringBuilder.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }

    }
}


class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(StringPalindrome.isPalindrome("ICICI"));
        System.out.println(StringPalindrome.isPalindrome("Welcome"));
    }
}
