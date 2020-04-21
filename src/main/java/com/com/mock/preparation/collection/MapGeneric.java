package com.mock.preparation.collection;

import java.util.HashMap;
import java.util.Map;

public class MapGeneric {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        {
            m.put(101, "Asha");
            m.put(102, "Usha");
            m.put(103, "Nisha");
            m.put(104, "Arti");
            for (Map.Entry m1 : m.entrySet())
                System.out.println(m1.getKey() + " " + m1.getValue());
        }
    }
}
