package com.mock.preparation.collection;

import java.util.ArrayList;

/*
Simple Program on Array List

[A, B, 123, A, null]
[B, 123, A, null]
[B, 123, A, hello, null, D]
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add(123);
        al.add("A");
        al.add(null);
        System.out.println(al);//[A, B, 123, A, null]
        al.remove("A");
        System.out.println(al); //B, 123, A, null]
        al.add(3, "hello");
        al.add("D");
        System.out.println(al);  //[B, 123, A, hello, null, D]

    }
}
