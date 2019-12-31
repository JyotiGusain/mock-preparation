package com.mock.preparation.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

/*
About RandomAccess

    true
    true
    true
    false
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();
        System.out.println(al instanceof Serializable);
        System.out.println(ll instanceof Cloneable);// Collection implements Serializable and Cloneable interfaces
        System.out.println(al instanceof RandomAccess);
        System.out.println(ll instanceof RandomAccess);// Only ArrayList and Vector implements RandonAccess interface
    }
}
