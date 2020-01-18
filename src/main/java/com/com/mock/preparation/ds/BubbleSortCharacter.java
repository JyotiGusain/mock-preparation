package com.mock.preparation.ds;

/*
    Esha
    Tanishq
    Tannu
    Virendra

 */
public class BubbleSortCharacter {
    public static void main(String[] args) {
        String a[] = {"Tanishq", "Tannu", "Virendra", "Esha"};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    String temp = a[j];
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

