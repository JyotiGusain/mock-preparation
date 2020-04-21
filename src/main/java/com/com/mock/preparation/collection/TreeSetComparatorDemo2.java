package com.mock.preparation.collection;
/*
Here in this program we use Comaparator() but still we can see in some place compareTo() method is used
Because when we do  return i1.compareTo(i2); here it will take compareTo() only.
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparatorDemo2 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                //return i1.compareTo(i2);        //[1, 2, 10, 14, 17, 20, 100, 212, 1098] its in ascending order
                //return -i1.compareTo(i2);      //[1098, 212, 100, 20, 17, 14, 10, 2, 1] its descending order
                //return i2.compareTo(i1);      //[1098, 212, 100, 20, 17, 14, 10, 2, 1] its descending order
                //return-i2.compareTo(i1);      //[1, 2, 10, 14, 17, 20, 100, 212, 1098] its in ascending order
                //return+1;                    //[10, 20, 1, 14, 2, 100, 1098, 212, 17] as the values were added
                //return-1;                   //[17, 212, 1098, 100, 2, 14, 1, 20, 10] from last to first
                return 0;                    //[10](only first element will be inserted other all will be considered as duplicates)

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


