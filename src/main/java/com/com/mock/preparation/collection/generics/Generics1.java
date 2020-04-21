package com.mock.preparation.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Hello");
        l.add("java");
        //String s= l.get(1);

        System.out.println("element is " + l);

        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
