package com.mock.preparation.ducat.Oops.constructor;

public class Dconstructor {
    int x;
    int y;

    Dconstructor() {
        x = 10;
        y = 20;
    }

    public static void main(String[] args) {
        Dconstructor d1 = new Dconstructor();
        Dconstructor d2 = new Dconstructor();
        d1.show();
        d2.show();
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}
