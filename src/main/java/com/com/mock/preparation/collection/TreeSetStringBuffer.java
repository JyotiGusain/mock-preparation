package com.mock.preparation.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("S"));
        t.add(new StringBuffer("T"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("Q"));
        t.add(new StringBuffer("P"));
        System.out.println();
    }
}

class MComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}
