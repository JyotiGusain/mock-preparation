package com.mock.preparation.ducat.Oops.constructor;

public class Copyconstructor {
    int x;
    int y;

    Copyconstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Copyconstructor(Copyconstructor z) {
        this.x = z.x;
        this.y = z.y;
    }

    public static void main(String[] args) {
        Copyconstructor c1 = new Copyconstructor(10, 20);
        c1.show();

    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}
