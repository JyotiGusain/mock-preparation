package com.mock.preparation.dateclass;
/*
Sat Feb 29 02:42:48 GMT 2020
 */

import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        Date d = new Date();
        String s = d.toString();
        System.out.println(s);

    }
}
