package com.mock.preparation.collection;

/*
Before Iteration--:  [Maney, Ravi, Xylon, chiru, farah, rahul]

After Iteration--:
Maney
Ravi
Xylon
chiru
farah
rahul
 */

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("Ravi");
        t.add("chiru");
        t.add("rahul");
        t.add("farah");
        t.add("Maney");
        t.add("Xylon");
        System.out.println(t);
        Iterator itr = t.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
