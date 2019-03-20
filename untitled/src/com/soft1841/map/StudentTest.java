package com.soft1841.map;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "黄敬理"));
        list1.add(new Student(2, "袁腾飞"));
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(4, "王欢乐"));
        list2.add(new Student(5, "孟妮"));
        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list1);
        map.put("女生", list2);
        System.out.println("********按性别输出结果********");
        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();
            for (Student s : list) {
                System.out.println(s.getId() + s.getName());
                System.out.println();
            }
        }
    }
}