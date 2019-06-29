package com.java.util.fuxi.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkList {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker(18,"zhang3",3000));
        workerList.add(new Worker(25,"li4",3500));
        workerList.add(new Worker(22,"wang5",3200));
        //添加赵六
        workerList.add(3,new Worker(24,"zhao6",3300));
        //删除王五
        workerList.remove(2);
        System.out.println("for循环遍历，打印工人的信息");
        for (int i = 0, len = workerList.size(); i < len; i++){
            System.out.println(workerList.get(i));
        }
        System.out.println("迭代器遍历输出，工人信息");
        Iterator<Worker> iterator = workerList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
