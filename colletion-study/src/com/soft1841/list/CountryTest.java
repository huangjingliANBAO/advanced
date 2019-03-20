package com.soft1841.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 黄敬理
 * 2019.03.20
 * Comparable接口使用
 */
public class CountryTest {
    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        list.add(new Country("日本",37));
        list.add(new Country("中国",960));
        list.add(new Country("法国",64));
        //调用Collections的sort方法
        Collections.sort(list);
        //用forEach遍历list集合
        for (Country country:list
             ) {
            System.out.println("国家:" + country.getCountry()+"  "+"国土面积为：" + country.getArea());

        }
    }
}
