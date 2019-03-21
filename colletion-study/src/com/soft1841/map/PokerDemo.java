package com.soft1841.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
//创建一个 HashMap 的集合
        HashMap<Integer, String> hashMap = new HashMap<>();
//创建一个 ArrayList 的集合
        ArrayList<Integer> arrayList = new ArrayList<>();
//创建一个花色与数字的数组
        String[] colors = {"♥", "♦", "♠", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2"};
//从 0 开始往 HashMap 里面存储数字，同时往 ArrayList 里面存储数字
        int index = 0;
        for (String number : numbers
        ) {
            for (String color : colors
            ) {
                String Poker = color.concat(number);
                hashMap.put(index, Poker);
                arrayList.add(index);
                index++;
            }
        }
        hashMap.put(index, "大王");
        hashMap.put(index, "小王");
        arrayList.add(index);
//洗牌，将编号打乱
        Collections.shuffle(arrayList);
//发牌，为了保证编号是排序的，创建一个 TreeSet 集合，获取编号
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for (int x = 0; x < arrayList.size(); x++) {
            if (x >= arrayList.size() - 3) {
                dipai.add(arrayList.get(x));
            } else if (x % 3 == 0) {
                player1.add(arrayList.get(x));
            } else if (x % 3 == 1) {
                player2.add(arrayList.get(x));
            } else if (x % 3 == 2) {
                player3.add(arrayList.get(x));
            }
        }
//看牌，遍历编号，到 HashMap 集合找到对应的牌
        lookPoker("玩家 1", player1, hashMap);
        lookPoker("玩家 2", player2, hashMap);
        lookPoker("玩家 3", player3, hashMap);
        lookPoker("底牌", dipai, hashMap);
    }
    //看牌的方法
    private static void lookPoker(String name, TreeSet<Integer> treeSet,
                                  HashMap<Integer, String> hashMap) {
        {
            System.out.println();
            System.out.println(name + "的牌是");
            for (Integer key : treeSet) {
                String value = hashMap.get(key);
                System.out.print(value + " ");
            }
        }
    }
}
