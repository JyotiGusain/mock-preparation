package com.mock.preparation.basic;

public class Printoddevennumber {
    public static void main(String[] args) {
        {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}

class Evennumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}