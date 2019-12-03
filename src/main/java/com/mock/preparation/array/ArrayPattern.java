package com.mock.preparation.array;

public class ArrayPattern {

    public static void main(String[] args) {
        int k=0;
        for(int i =5;i<=9;i++){
            for(int j=i;j>=k+1;j--){
                System.out.print(j);
            }
            k++;
            System.out.println("\n");
        }
    }
}
