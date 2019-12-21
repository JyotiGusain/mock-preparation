package com.mock.preparation.ducat.Oops.arrayassignment;

public class SortingAscendingArray {
    public static void main(String[] args) {
        int temp = 0;
        int a[] = new int[]{4, 9, 2, 0, 1, 6};
        System.out.print("Enter the original Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        //Display the array in ascending order

        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        System.out.println();
        System.out.println("Array in ascending order is: ");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
