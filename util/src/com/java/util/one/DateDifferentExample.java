package com.java.util.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 黄敬理
 * 2019.03.18
 * 计算两个时间差
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        String[] time = {"2019-3-24 16:51:00","2019-3-24 16:50:00","2000-1-1 1:1:1"};
        String[] results = new String[time.length];
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间：" + format.format(new Date()));
        for (int i = 0; i < time.length; i++){
           results[i] = timeCal(time[i]);
            System.out.println(time[i] + "   " + results[i]);
        }
    }
    private static String timeCal(String time){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try{
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        long seconds = diff/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        long days = hours/24;
        if (seconds < 60){
            return "刚刚";
        }else if (minutes < 60){
            return minutes + "分钟前";
        }else if (hours < 24){
            return hours + "小时前";
        }else {
            return days + "天前";
        }
    }
}
