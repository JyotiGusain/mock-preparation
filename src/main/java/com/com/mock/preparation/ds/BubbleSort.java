package com.mock.preparation.ds;

/*
Arrange the elements in ascending order

11
12
45
56
78
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {45, 56, 12, 78, 11};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

    }
}
