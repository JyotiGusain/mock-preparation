package com.mock.preparation.ducat.Oops.constructor;

public class ViaMethod {
    int x = get();

    ViaMethod() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new ViaMethod();
    }

    int get() {
        System.out.println(x);
        return 20;
    }
}