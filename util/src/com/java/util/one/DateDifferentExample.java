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
        //分别定义起止时间
        String startTime = "2019-03-18 01:31:58";
        String stopTime = "2019-03-17 04:36:22";
        String time2 = "2019-3-17 20:22:22";
        //获取当前时间
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间: " + format.format(date));
        Date d1;
        Date d2;
        Date d3;
        long diff = 0;
        //通过SimpleDateFormat的对象把String类型的时间对象转化成Date类型的对象
        try{
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            d3 = format.parse(time2);
            //毫秒ms的差值
            diff = date.getTime() - d1.getTime();
            diff = date.getTime() - d2.getTime();
            diff = date.getTime() - d3.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        //将毫秒分别换算成秒、分、小时、天
        //long diffSeconds = diff / 1000;
        long diffMinutes = diff / (1000 * 60);
        long diffHours = diff / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 *24);
        //System.out.println(startTime + " " +Math.abs(diffSeconds) + " 秒前");
        System.out.println(startTime + " "+ Math.abs(diffMinutes) + " 分前");
        System.out.println(stopTime +" "+ Math.abs(diffHours) + " 小时前");
        System.out.println(time2 +" "+ Math.abs(diffDays) + " 天前");
        System.out.println(format.format(date) +" "+" 刚刚");

    }
}
