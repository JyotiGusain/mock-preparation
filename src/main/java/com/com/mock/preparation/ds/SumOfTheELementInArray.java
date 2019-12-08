package com.mock.preparation.ds;

public class SumOfTheELementInArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = {1, 2, 3, 8, 0, 6};

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
