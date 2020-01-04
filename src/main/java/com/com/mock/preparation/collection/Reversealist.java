package com.mock.preparation.collection;

import java.util.Iterator;
import java.util.LinkedList;

/*
Reverse a list

Intial elements:  [Om, Shaym, Rahul]
Rahul
Shaym
Om
 */
public class Reversealist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Om");
        ll.addLast("Shaym");
        ll.add("Rahul");

        System.out.println("Intial elements:  " + ll);

        Iterator itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
