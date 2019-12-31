package com.mock.preparation.collection;

import java.util.LinkedList;

/*
Linked List example to add elements

Initial list of Elements:[Ajay, Vijay, Sanjay, Rahul, seema, gouri]
List of elements:  [Ajay, Vijay, Sanjay, Rahul, seema, gouri, OM, Rani]
List of elemrnts after removal:  [Ajay, Vijay, Sanjay, seema, gouri, OM, Rani]
List of elements after the removal of first and the last occurance:  [Vijay, Sanjay, gouri, OM, Rani]
List of elements:  [Vijay, Sanjay, gouri, OM, Rani, Maansa, rohan]
[Vijay, Virendra, Sanjay, gouri, OM, Rani, Maansa, rohan]
After first and the last elements:  [Urmila, Vijay, Virendra, Sanjay, gouri, OM, Rani, Maansa, rohan, Shaym]
 */
public class Linkedlistexampletoaddelements {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Ajay");
        ll.add("Vijay");
        ll.add("Sanjay");
        ll.add("Rahul");
        ll.add("seema");
        ll.add("gouri");
        System.out.println("Initial list of Elements:" + ll);

        LinkedList ll1 = new LinkedList();
        ll1.add("OM");
        ll1.add("Rani");

        ll.addAll(ll1);
        System.out.println("List of elements:  " + ll);

        ll.remove(3);
        System.out.println("List of elemrnts after removal:  " + ll);

        ll.removeFirstOccurrence("Ajay");
        //ll.removeLastOccurrence("Ajay");
        //ll.removeFirstOccurrence("seema");
        ll.removeLastOccurrence("seema");
        System.out.println("List of elements after the removal of first and the last occurance:  " + ll);

        LinkedList ll2 = new LinkedList();
        ll2.add("Maansa");
        ll2.add("rohan");

        ll.addAll(ll2);
        System.out.println("List of elements:  " + ll);

        ll.add(1, "Virendra");
        System.out.println(ll);

        ll.addFirst("Urmila");
        ll.addLast("Shaym");
        System.out.println("After first and the last elements:  " + ll);

    }
}
