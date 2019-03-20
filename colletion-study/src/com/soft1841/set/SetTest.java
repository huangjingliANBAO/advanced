package com.soft1841.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println(set);
        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("A");
        String s4 = new String("B");
        System.out.println(set);
        //用for循环遍历set集合
        System.out.println("通过for循环遍历输出");
        for (int i = 0,len = set.size();i < len;i++){
            System.out.println();
        }
        //用Iterator迭代器遍历集合
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"   ");
        }
        //用Lambda表达式遍历集合
        System.out.println("****************");
        set.forEach(s -> System.out.println(s+"  "));




    }
}
