package com.mock.preparation.exceptions;

public class Emp {
    int age;

    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.get(16);
    }

    void get(int age) {
        if (age < 18) {
            try {
                throw new ArithmeticException("IA");
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        getClass();
        {
            this.age = age;
        }
    }
}
