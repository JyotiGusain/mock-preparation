package com.mock.preparation.string;

public class Getbytes {
    public static void main(String[] args) {
        String s = "Hello";
        try {
            byte ch[] = s.getBytes();
            for (int i = 0; i < ch.length; i++) {
                System.out.println(ch[i]);
            }
        } catch (Exception e) {
            System.out.println("Unsuppoerted character set");
        }
    }
}
