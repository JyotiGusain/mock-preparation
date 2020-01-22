package com.mock.preparation.collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
TransverseElementsInDescendingOrder--:
0
4
45
456
1422
8654

 */
public class TransverseElementsInDescendingOrder {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(4);
        t.add(45);
        t.add(1422);
        t.add(456);
        t.add(8654);
        t.add(0);
        System.out.println(t);

        Iterator itr = t.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
