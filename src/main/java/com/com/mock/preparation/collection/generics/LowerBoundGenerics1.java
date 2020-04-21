package com.mock.preparation.collection.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundGenerics1 {
    private static void addadd(List<? super Double> num) {
        for (Object o : num) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Double> l1 = Arrays.asList(1.0, 2.0, 3.3, 4.2, 5.1);
        System.out.println("Values are: ");
        addadd(l1);

        List<Number> l2 = Arrays.asList(1, 2, 3, 4);
        System.out.println("Values are ");
        addadd(l2);

    }
}
