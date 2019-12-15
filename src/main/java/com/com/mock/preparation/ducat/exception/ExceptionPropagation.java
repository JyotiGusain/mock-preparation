package com.mock.preparation.ducat.exception;

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.p();
        System.out.println("normal flow");

    }

    void m() {
        int x = 20 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();

        } catch (Exception e) {
            System.out.println("Exception are handled");
        }
    }

}
