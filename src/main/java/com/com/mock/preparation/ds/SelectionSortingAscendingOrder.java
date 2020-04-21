package com.mock.preparation.ds;

public class SelectionSortingAscendingOrder {
    public static void main(String[] args) {
        int a[] = {23, 45, 2, 67, 90, 1};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

class SelectioSortingDescendingOrder {
    public static void main(String[] args) {

        int a[] = {87, 34, 0, 12, 45};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
