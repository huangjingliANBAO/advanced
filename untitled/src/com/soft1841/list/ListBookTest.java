package com.soft1841.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListBookTest {
    public static void main(String[] args) {
        //创建一个List接口对象，元素为String类型
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("HTML");
        list.add("高数");
        list.add("高数");
        //用util的Random类随机产生一个[0,list.size()-1的随机整数
        int length = list.size();
        System.out.println("集合长度是：" + length);
        Random random = new Random();
        int index = random.nextInt(length);
        //取出list中索引为index的元素
        System.out.println("随机取出的元素是：" + list.get(index));
        System.out.println("************");
        //用for循环遍历list
        System.out.println("for循环遍历结果");
        for(int i = 0; i < length; i++){
            System.out.println(list.get(i));
        }
        //用Lambda表达式遍历list
        System.out.println("Lambda表达式遍历结果");
        list.forEach(s -> System.out.println(s));
        //使用Iterator迭代器遍历list
        System.out.println("用Iterator迭代器遍历结果");
        Iterator<String> iterator = list.iterator();//创建迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用remove移除元素
        list.remove(3);
        System.out.println("移除索引为3的元素之后的list集合为：");
        list.forEach(s -> System.out.println(s));
    }


}
