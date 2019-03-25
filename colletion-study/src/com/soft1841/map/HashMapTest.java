package com.soft1841.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("雷霆","威少");
        map.put("湖人","勒布朗");
       Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
       while(iterator.hasNext()){
          Map.Entry<String,String> entry = iterator.next();
          System.out.println(entry.getKey() + "  " + entry.getValue());
      }
    }

}
