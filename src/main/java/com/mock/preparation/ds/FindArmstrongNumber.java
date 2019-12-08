package mock.preparation.ds;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        int num = 30, p, rem = 0, total = 0;
        p = num;

        while (num != 0) {
            rem = num % 10;
            total = rem * rem * rem + total;
            num /= 10;
        }
        if (total == p) {
            System.out.println(p + " is an Armstrong Number");
        } else {
            System.out.println(p + " is not an Armstrong Number");
        }
    }
}
