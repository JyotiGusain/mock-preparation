package com.mock.preparation.collection.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundGenerics {
    private static void addNumbers(List<? super Integer> list) {
        for (Object i : list) {
            System.out.println(i);

        }
    }


    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 2, 3);
        System.out.println("Displaying the numbers");
        addNumbers(l1);

        List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Displaying the number values");
        addNumbers(l2);
    }
}
