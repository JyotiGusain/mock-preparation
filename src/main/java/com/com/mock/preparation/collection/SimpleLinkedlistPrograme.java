package com.mock.preparation.collection;
/*
Simple LinkedList Programe

A
Hello
123
b

 */

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLinkedlistPrograme {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("Hello");
        ll.add(123);
        ll.add('b');

        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
