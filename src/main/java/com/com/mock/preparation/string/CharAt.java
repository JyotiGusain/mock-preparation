package com.mock.preparation.string;

public class CharAt {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            char start = str.charAt(2);
            System.out.println(start);
        }

            /*String str = "Welcome to the world of java";
            char start = str.charAt(9);
            System.out.println(start);
            char finish = str.charAt(str.length() - 1);
            char c = str.charAt(4);
            System.out.println(start);
            System.out.println(finish);
            System.out.println(c);
        }*/ catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }

    }

}
