package com.mock.preparation.array;

public class ArrayPattern {

    public static void main(String[] args) {
        printPattern1();
    }

    /*
    Patten to print
    54321
    65432
    76543
    87654
    98765
     */
    private static void printPattern(){
        int k=0;
        for(int i =5;i<=9;i++){
            for(int j=i;j>=k+1;j--){
                System.out.print(j);
            }
            k++;
            System.out.println("\n");
        }
    }

    /*
   Patten to print
   10101
   10101
   10101
   10101
   10101
    */
    private static void printPattern1(){
        //choice1
        for(int i =0;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j%2==0){
                    System.out.print("o");
                }else{
                    System.out.print("1");
                }

            }

            System.out.println("\n");
        }

        System.out.println("2nd method");

        //choice 2
        for(int i =0;i<=5;i++){
                    System.out.println("1o101");
            }
    }
}
