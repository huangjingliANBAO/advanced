package com.java.util.java.erji;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算微信动态时间测试
 * @author 黄敬理
 * 2019.03.27
 */
public class WxTest {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] originalTime = {"2019-3-27 17:01:00" , "2018-2-2 22:22:22","2019-2-2 22:22:22"};
        String[] results = new String[originalTime.length];
        System.out.println("现在时间：" + format.format(new Date()));
        for (int i = 0; i < originalTime.length ; i++){
            results[i] = timeCha(originalTime[i]);
            System.out.println(results[i]);
        }
    }
    private static String timeCha(String time){
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
        }
        else if (minutes < 60){
            return minutes + "分钟前";
        }
        else if (hours < 24){
            return hours + "小时前";
        }
        else {
            return days + "天前";
        }

    }
}
