package com.mock.preparation.ducat.Oops.arrayassignment;

public class MinMax2DArray {
    public int findMaxNumber(int[][] a) {
        try {
            int max = a[0][0];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] > max)
                        max = a[i][j];

                }
            }
            return max;
        } catch (NullPointerException e) {
            System.out.println("Exception Occured");
            return -1;
        }


    }

    public int findMinNumber(int[][] a) {
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }


            }
        }
        return min;
    }
}





