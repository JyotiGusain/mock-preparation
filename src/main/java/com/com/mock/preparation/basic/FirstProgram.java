package com.mock.preparation.basic;

/*
first program to print hello
 */
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("HELLO");

        boolean isStar = true;
        int k =2;
        for(int i =0;i<5 ;i++){
            if(isStar){
                display("*");
                isStar = false;
            }else {
                display(""+k);
                k = k+2;
                isStar = true;
            }
            System.out.println("");
        }
    }

    private static void display(String s) {
        for(int j=0;j<5;j++){
            System.out.print(s);
        }
    }
}

