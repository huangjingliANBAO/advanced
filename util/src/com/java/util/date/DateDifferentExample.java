package com.java.util.date;

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
        //分别定义起始时间
        String startTime = "2019-03-18 06:00:00";
        String stopTime = "2019-03-17 06:00:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        long diff = 0;
        //通过SimpleDateFormat的对象来把String类型的时间对象转换为Date类型的时间对象
        try{
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            diff = d2.getTime() - d1.getTime();

        }catch(ParseException e){
            e.printStackTrace();
        }
        long diffSeconds = diff/1000;
        long diffMinutes = diff/(1000*60);
        long diffHours = diff/(1000*60*60);
        long diffDays = diff/(1000*60*60*24);
        System.out.println("两个时间差：" + Math.abs(diffSeconds) + "秒");
        System.out.println("两个时间差：" + Math.abs(diffMinutes) + "分");
        System.out.println("两个时间差：" + Math.abs(diffHours) + "小时");
        System.out.println("两个时间差：" + Math.abs(diffDays) + "天");

    }
}
