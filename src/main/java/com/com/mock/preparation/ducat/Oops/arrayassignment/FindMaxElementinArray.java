package com.mock.preparation.ducat.Oops.arrayassignment;

public class FindMaxElementinArray {
    /*
    Find the Maximum element in array

    Maximun element in array is: 5
     */

    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2, 1};
        int maximum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximum)
                maximum = a[i];
        }
        System.out.println("Maximun element in array is: " + maximum);
    }
}

class FindMinElementinArray {
    /*
    Find the Minimum element element in array


    Minimum element in the array: 1
     */
    public static void main(String[] args) {
        int[] a = new int[]{4, 6, 8, 2, 9, 1};
        int min = a[0];
        for (int i = 0; i <= 5; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Minimum element in the array: " + min);
    }
}


