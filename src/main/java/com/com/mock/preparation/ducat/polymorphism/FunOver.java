package com.mock.preparation.ducat.polymorphism;

public class FunOver {
    static void show() {
        System.out.println("Zero Arguments");
    }

    static void show(int x) {
        System.out.println("one arguments");
    }

    static void show(int x, int y) {
        System.out.println("two arguments");
    }

    public static void main(String[] args) {
        show();
        show(2);
        show(12, 34);
    }
}
