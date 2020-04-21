package com.mock.preparation.collection;

import java.util.TreeSet;

/*
String class implements comparable interfacse
If also it depends on Normal Sorting Order and objects should be homogenous and comparable.
but StringBuffer class doesnot implements comparable interface
 */
public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("c"));
        t.add(new StringBuffer("s"));
        t.add(new StringBuffer("W"));
        t.add(new StringBuffer("G"));
        t.add(new StringBuffer("d"));
        System.out.println(t);
    }
}
