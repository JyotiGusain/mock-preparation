package com.mock.preparation.threads;

public class ConstructorChaining {
    public ConstructorChaining() {
        System.out.println("Hello");
    }

    public ConstructorChaining(String name) {
        System.out.println("Welcome to World of Java");

    }
}

class Child extends ConstructorChaining {
    public Child() {
        this("A");
        System.out.println("Welcome");
    }


    public Child(String a) {
        super("A");
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
