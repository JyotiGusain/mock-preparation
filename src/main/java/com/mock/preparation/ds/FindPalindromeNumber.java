package mock.preparation.ds;

import java.util.Scanner;

public class FindPalindromeNumber {
    public static void main(String[] args) {
        int num, rem = 0, r1 = 0;
        System.out.println("enter thr number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        int temp = num;

        while (temp != 0) {
            rem = temp % 10;
            r1 = r1 * 10 + rem;
            temp = temp / 10;
        }
        if (r1 == num) {
            System.out.println("Is a palindrome number");
        } else
            System.out.println("not a palindrome number");

    }
}

