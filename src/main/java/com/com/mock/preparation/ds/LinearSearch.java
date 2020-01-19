package com.mock.preparation.ds;

/*
Item = 3;
 Item 3 should be printed at 2 Index Position

 Item = 56;
 Item 56 is not present in the Index
 */
public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {2, 6, 3, 7, 9};
        int item = 3;
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                System.out.println(" Item " + item + " should be printed at " + i + " Index Position");
                // Item= 9 should be printed at 4 Index Position;
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Item " + item + " is not present in the Index");
        }
    }
}

