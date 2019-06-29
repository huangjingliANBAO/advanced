package com.java.util.fuxi.demo3;

import java.util.*;

/**
 * java复习题
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "德国");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1970", "巴西");
        map.put("1974", "德国");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "德国");
        map.put("1994", "巴西");
        map.put("1998", "法国");
        map.put("2002", "巴西");
        map.put("2006", "意大利");
        //Iterator迭代器输出年份映射世界杯冠军
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() +"   " + entry.getValue());
        }
        //输入一个年份，输出改年份世界杯冠军
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        String country = sc.nextLine();
        if (map.containsKey(country) == true) {
            System.out.println("该年份夺得世界杯的是：" + map.get(country));
        } else {
            System.out.println("这年没世界杯");
        }
        //输入一个国家，输出改国家获得世界杯冠军年份
        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入一个国家");
        String nian = sc1.nextLine();
        if (map.containsValue(nian) == true) {
            for (String key : map.keySet()) {
                if (map.get(key).equals(nian)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("这个国家没有夺过大力神杯");
        }
    }
}
