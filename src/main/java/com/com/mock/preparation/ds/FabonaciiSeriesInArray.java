package com.mock.preparation.ds;

public class FabonaciiSeriesInArray {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);

        int n3;
        for (int i = 1; i <= 5; i++) {
            n3 = n1 + n2;
            System.out.print("  " + n3);
            n1 = n2;
            n2 = n3;

        }
    }
}
