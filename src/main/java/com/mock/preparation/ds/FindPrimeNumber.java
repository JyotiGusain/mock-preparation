package mock.preparation.ds;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int temp = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (num % 2 == 0) {
                    temp = temp + 1;
                }
            }

        }
        if (temp > 0) {
            System.out.println("Number is not prime");
        } else {
            System.out.println("Number is prime");
        }


    }
}
