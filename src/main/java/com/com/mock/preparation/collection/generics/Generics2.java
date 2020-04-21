package com.mock.preparation.collection.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generics2 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "ABC");
        m.put(2, "ABC");
        m.put(3, "ABC");

        //For set and Iterator

        Set<Map.Entry<Integer, String>> set = m.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
