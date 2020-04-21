package com.mock.preparation.ds;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {12, 34, 43, 67, 75};


        int search = 99;
        int li = 0;
        int hi = a.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi) {
            if (a[mi] == search) {
                System.out.println(mi);
                break;
            } else if (a[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi + 1;
            }
            mi = (li + hi) / 2;
            if (li > hi) {
                System.out.println("element not found");
            }
        }
    }
}