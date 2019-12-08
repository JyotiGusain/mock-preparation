package mock.preparation.ds;

public class FindArmstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        int temp, total = 0;

        while (num != 0) {
            temp = num % 10;
            total = total * temp * temp * temp;
            num = num / 10;
        }
        if (total == num) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Not an armstrong");
        }
    }
}
