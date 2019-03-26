package com.java.util.one.test;

import java.time.LocalDate;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Yeaer : %d Month : %d day : %d t %n",year,month,day);
    }
}
