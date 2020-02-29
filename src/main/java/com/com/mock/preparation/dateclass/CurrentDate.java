package com.mock.preparation.dateclass;
/*
YEAR2020
Month1
Day6
Europe/London

 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        //Date date1= new Date(20,7,1987,12,54,6);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println(cal.toString());
        displayDateinfo(cal);
        cal.clear();

    }

    static void displayDateinfo(GregorianCalendar cal) {
        String day[] = {" ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String month[] = {"JAN", "FEB", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        String AM_PM[] = {"AM", "PM"};
        System.out.println("YEAR" + cal.get(Calendar.YEAR));
        System.out.println("Month" + cal.get(Calendar.MONTH));
        System.out.println(("Day" + cal.get(Calendar.DAY_OF_WEEK)));
        TimeZone tz = cal.getTimeZone();
        System.out.println(tz.getID());
    }
}
