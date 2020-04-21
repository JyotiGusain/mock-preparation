package com.mock.preparation.collection.generics;

import java.util.ArrayList;

public class UnboundWildcards {
    private static double add(ArrayList<? extends Number> num) {


        double sum = 0;

        for (Number n : num) {
            sum = sum + n.doubleValue();
        }
        return (sum);
    }


    public static void main(String[] args) {
        ArrayList<Double> l1 = new ArrayList<Double>();
        l1.add(10.3);
        l1.add(11.2);
        System.out.println("Displaying the sum " + add(l1));

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(10);
        l2.add(11);
        System.out.println("Displaying the sum " + add(l2));
    }
}


