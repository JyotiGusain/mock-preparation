package com.mock.preparation.collection;
/*
WAP to insert integer object into the TreeSet where the sorting order is Decending order
The default given order--:
[1, 2, 10, 14, 17, 20, 100, 212, 1098]

Sorting Order in Descending Order--:
 [1098, 212, 100, 20, 17, 14, 10, 2, 1]
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 < i2) {
                    return +1;
                } else if (i1 > i2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        t.add(10);
        t.add(20);
        t.add(1);
        t.add(14);
        t.add(2);
        t.add(100);
        t.add(1098);
        t.add(212);
        t.add(17);
        System.out.println(t);

    }


}


