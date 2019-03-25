package com.java.util.one.test;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        //存储在数组中
        String[] temas = {"伊朗","韩国","日本","澳大利亚","沙特阿拉伯","乌兹别克斯坦","阿拉伯联合酋长国","卡塔尔","中国","叙利亚"};
        //创建键，值分别为Integer，String的map集合对象
        Map<Integer,String> map = new HashMap<Integer, String>();
        //循环遍历数组temas中的元素
        for (int i = 0;i < temas.length; i++){
           map.put(i + 1,temas[i]);//向map集合添加元素
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("依据名次输出排名前十的足球队：");
        try{
            int number = scanner.nextInt();
            if (number > 0&& number <= 10){
                System.out.println("亚足联排名第" + number + "的足球队是：" + map.get(number) + "");
                scanner.close();
            }else{
                System.out.println("输入错误");
            }
        }catch(InputMismatchException e){
            System.out.println("输入错误，只能输入1-10排名的足球队");
        }

    }
}
