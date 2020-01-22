package com.mock.preparation.collection;

import java.util.TreeSet;

/*
Remove And  Retriev the Highest and Lowest Value

[A, Apple, HOME, Queen]
Highest Value : A
Lowest value :  Queen
 */
public class RemoveAndRetrievetheHighestandLowestValue {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("Apple");
        t.add("Queen");
        t.add("HOME");
        System.out.println(t);

        System.out.println("Highest Value : " + t.pollFirst());
        System.out.println("Lowest value :  " + t.pollLast());
    }
}
