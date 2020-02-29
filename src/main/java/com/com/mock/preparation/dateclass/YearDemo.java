package com.mock.preparation.dateclass;
/*
2020
2018
2025
Leap Year

 */

import java.time.Year;

public class YearDemo {
    public static void main(String[] args) {
        Year y1 = Year.of(2020);
        System.out.println(y1);
        Year y2 = y1.minusYears(2);
        System.out.println(y2);
        Year y3 = y1.plusYears(5);
        System.out.println(y3);
        Year y4 = Year.now();
        if (y1.isLeap()) {
            System.out.println("Leap Year");
        }
    }
}
