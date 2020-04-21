package com.mock.preparation.collection.generics;

public class PrintArrayElements {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40};

        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Integer Elements");
        printArray(intArray);
        System.out.println("Character Elements");
        printArray(charArray);

    }
}
