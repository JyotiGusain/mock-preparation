package com.mock.preparation.ducat.Oops.constructor;

public class Atclasslevel {
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Atclasslevel at1 = new Atclasslevel();
        Atclasslevel at2 = new Atclasslevel();
        at1.show();
        at2.show();
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}
