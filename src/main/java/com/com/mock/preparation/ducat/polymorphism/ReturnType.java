package com.mock.preparation.ducat.polymorphism;

public class ReturnType {
    static void show(char x) {
        System.out.println("no return type");
    }

    static void show(int z) {
        System.out.println("with return type");
        return;
    }


}
