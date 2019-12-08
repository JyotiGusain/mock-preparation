package mock.preparation.ds;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        int num, rem = 0, rev = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num /= 10;
        }
        System.out.println("The reverse number is: " + rev);
    }

}

