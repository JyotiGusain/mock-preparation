package com.mock.preparation.ducat.Oops.arrayassignmentpractice;

public class ArrayMaximunNumber {
    public static void main(String[] args) {
        int[] x = new int[]{56, 24, 123, 672, 197};
        int maximum = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maximum)
                maximum = x[i];
        }
        System.out.println("Maximun element in array is: " + maximum);
    }

}

class ArrayMinimumNumber {
    public static void main(String[] args) {
        int x[] = new int[]{23, 3, 1, 5, 4, 88};
        int min = x[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] < min)
                min = x[i];
        }
        System.out.println("Minimum element in array  is: " + min);

    }
}