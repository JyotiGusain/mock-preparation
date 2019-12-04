package Ducat;

public class ArrayPattern3 {
    public static void main(String[] args) {

        /*
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1
         */

        int count = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

