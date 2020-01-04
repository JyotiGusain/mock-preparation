package com.mock.preparation.ducat.Oops.arrayassignment;


public class SortingDescendingArray {
    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 4, 8, 23, 6, 0, 5};
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Descending order: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
