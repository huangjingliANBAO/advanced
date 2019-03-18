//package com.java.util.one.two;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        System.out.println("id          作者           标题          时间 ");
//        List<Article> articleList = new ArrayList<>();
//        SimpleDateFormat format = new SimpleDateFormat();
//        String str = "yyyy-MM-dd HH:ss:mm";
//        articleList.add(new Article(01,"韦伯","总有一天,你要有个人走","2018-02-25 01:01:01"));
//        articleList.add(new Article(02,"卡耐基","人性的弱点，成为西方世界最持久的人文畅销书","2018-03-18 22:00:00"));
//        articleList.add(new Article(03,"松浦弥太郎","今天也要用心过生活","2018-3-18 20:00:59"));
//        Iterator<Article> iterator = articleList.iterator();
//        while (iterator.hasNext()){
//            Article article = iterator.next();
//            String result;
//            result = timeCal(str.format(article.getWriteTime()));
//            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"..."+
//                    article.getAuthor()+"  "+result);
//        }
//    }
//    private static String timeCal(String time) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d1;
//        long diff = 0;
//        try {
//            d1 = format.parse(time);
//            Date now = new Date();
//            diff = now.getTime() - d1.getTime();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        long seconds = diff / 1000;
//        long minutes = seconds / 60;
//        long hours = minutes / 60;
//        long days = hours / 24;
//        if (seconds < 60) {
//            return "刚刚";
//        } else if (minutes < 60) {
//            return minutes + "分钟前";
//        } else if (hours < 24) {
//            return hours + "小时前";
//        } else {
//            return days + "天前";
//        }
//    }
//
//}
//
//
