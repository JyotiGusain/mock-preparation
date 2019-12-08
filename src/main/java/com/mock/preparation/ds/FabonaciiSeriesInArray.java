package mock.preparation.ds;

import java.util.Scanner;

public class FabonaciiSeriesInArray {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, num = 0;
        System.out.println("Enter the given number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            if (num >= 0) {
                n3 = n1 + n2;
                System.out.println(" " + n3);
                n1 = n2;
                n2 = n3;

            }
        }
    }
}
