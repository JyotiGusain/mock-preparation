package com.mock.preparation.collection;

import java.util.TreeSet;

/*
Example of Tree Set

[A, D, M, c, f, o]
Here all these aplhabets are arranged according to their UNICODE value.
If I won't comment  //t.add(new Integer(10));
then the exception will be thrown as ClassCastException
because TreeSet does not allow to insert Heterogeneous objects.

 //t.add(null);
For non empty tree set if we are trying to null then we will get NullPointerException

*/
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("c");
        t.add("D");
        t.add("o");
        t.add("f");
        t.add("M");
        t.add("o");
        //t.add(new Integer(10));
        //t.add(null);
        //t.add("z");
        System.out.println(t);
    }
}
