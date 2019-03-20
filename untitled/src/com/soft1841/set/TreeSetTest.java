package com.soft1841.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //使用TreeSet创建Set集合对象
        Set<Integer> set = new TreeSet<>();
        //向Set添加元素
        set.add(-5);
        set.add(-8);
        set.add(5);
        set.add(0);
        Iterator<Integer> iterator = set.iterator();
        System.out.println("set集合中的元素");
        //遍历并输出Set集合中的元素
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ "    ");
        }
    }
}
