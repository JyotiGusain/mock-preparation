package com.mock.preparation.Ducat;


public class MaxArray {
    public static void main(String[] args)
        /*
        To find the maximum number in the array

        Enter the size of an array: [I@6e0be858
        The max number in the array is: 788*/ {
        int z[] = new int[]{3, 45, 78, 12, 34, 4};

        int maximum = 0;

        System.out.println("Enter the size of an array: " + z);

        for (int i = 1; i < z.length; i++) {
            if (z[i] > maximum)
                maximum = z[i];
        }
        System.out.println("The max number in the array is: " + maximum);

    }
}
