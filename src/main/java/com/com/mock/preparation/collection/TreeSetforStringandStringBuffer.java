package com.mock.preparation.collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
How to insert string and stringbuffer objects into the treeset according to increasing order,
 if both have the same length the according to the alphabetical order

 [A, AA, ABC, xyz, ABCDE]
 */

public class TreeSetforStringandStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add("xyz");
        t.add("ABCDE");
        t.add(new StringBuffer("AA"));
        t.add(new StringBuffer("ABC"));
        t.add("A");
        t.add("AA");
        System.out.println(t);
    }

}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 < l2)
            return -1;
        else if (l1 > l2)
            return +1;
        else
            return s1.compareTo(s2);

    }
}

