package com.java.util.fuxi.demo3;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        /**
         * 以老师的名字作为值，其任课课程作为键
         */
        Map<String,String> map = new HashMap<>();
        System.out.println("老师  课程");
        map.put("Tom","Java");
        map.put("John","C语言");
        //创建迭代器遍历输出
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
