package mock.preparation.ds;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        try {
            int[] a = {5, 6, 7, 8, 9, 10};
            for (int i = 0; i <= a.length; i++) {
                for (int j = 0; j <= a.length; j++) {
                    if (a[i] % 2 == 0) {
                        System.out.println("It is an even number\n");
                    } else {
                        System.out.println("It is an odd number\n");
                    }
                }


            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        }
    }
}


