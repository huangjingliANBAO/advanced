package com.java.util.one.two;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//创建Calendar类
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前时间:" + year + "-"+month + "-" +day +" "+hour+":"+minute+":"+second);
        Date date = calendar.getTime();
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间:" + date);
        System.out.println("当前毫秒数:" + time);




    }
}
