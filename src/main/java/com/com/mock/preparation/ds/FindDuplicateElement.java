package com.mock.preparation.ds;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int a[] = {3, 4, 3, 5, 7, 6, 6, 8, 9, 9};
        System.out.println("Duplicates values are: ");
        //Scanner scanner = new Scanner(System.in);
        //num = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println(a[j] + "  ");
                }
            }
        }
    }
}
