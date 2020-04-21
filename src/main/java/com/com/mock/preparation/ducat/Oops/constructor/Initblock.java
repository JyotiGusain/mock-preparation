package com.mock.preparation.ducat.Oops.constructor;


public class Initblock {
    int x;

    {
        System.out.println("Init Block");
        this.x = 10;
    }

    Initblock() {
        //this(10);
        System.out.println("defeat");
        System.out.println(x);
    }

    Initblock(int x) {
        System.out.println(x);
        System.out.println("second");
    }

    public static void main(String[] args) {
        new Initblock();
        new Initblock(10);
        new Initblock();


    }
}
