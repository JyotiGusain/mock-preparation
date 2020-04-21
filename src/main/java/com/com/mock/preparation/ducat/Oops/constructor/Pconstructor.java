package com.mock.preparation.ducat.Oops.constructor;

public class Pconstructor {
    int x;
    int y;

    Pconstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Pconstructor p1 = new Pconstructor(12, 23);
        Pconstructor p2 = new Pconstructor(34, 45);
        p1.show();
        p2.show();
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}
