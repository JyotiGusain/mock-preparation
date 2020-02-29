package com.mock.preparation.dateclass;
/*
yyyy.mm.dd G 'at' hh:mm:ss:z-->  2020.22.29 AD at 03:22:33:GMT
hh 0'clock 'a' zzzzz-->  03 0clock AM Greenwich Mean Time

 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static void main(String[] args) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy.mm.dd G 'at' hh:mm:ss:z");

        System.out.println("yyyy.mm.dd G 'at' hh:mm:ss:z-->  " + df.format(new Date()));

        df = new SimpleDateFormat("hh 0'clock 'a zzzzz");
        System.out.println("hh 0'clock 'a' zzzzz-->  " + df.format(new Date()));


    }
}
