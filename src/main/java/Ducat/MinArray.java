package Ducat;

public class MinArray {
    /*

    Find the minimun number in the array
     */


    public static void main(String[] args) {
        int[] b = new int[]{9, 2, 5, 6, 1, 4, 3};    //7 elements

        int min = b[0];
        System.out.println("Enter the size of an array: " + b);

        for (int i = 0; i <= 6; i++) {
            if (min > b[i])
                min = b[i];
        }
        System.out.println(" Minimun number in the array is:  " + min);

    }
}

