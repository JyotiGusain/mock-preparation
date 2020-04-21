package com.mock.preparation.collection.generics;

import java.util.ArrayList;

public class UpperboundGenerics {
    private static int mul(ArrayList<? extends Number> num) {
        int mul = 1;
        for (Number n : num) {
            mul = mul * n.intValue();
        }
        return mul;
    }


    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(19);
        l1.add(11);
        System.out.println("Displaying the Integer Value " + mul(l1));

        ArrayList<Double> l2 = new ArrayList<Double>();
        l2.add(24.9);
        l2.add(30.7);
        System.out.println("Displaying the Double Value " + mul(l2));
    }
}
