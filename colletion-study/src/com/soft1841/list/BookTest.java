package com.soft1841.list;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        //创建Book集合
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"Java",55.55));
        bookList.add(new Book(2,"C++",55.55));
        bookList.add(new Book(3,"C语言",55.55));
        bookList.add(new Book(4,"Python",55.55));
        System.out.println(bookList);
        //向Book添加元素
        bookList.add(4,new Book(5,"高数",55.55));
        System.out.println(bookList);
        //删除元素
        bookList.remove(2);
        System.out.println(bookList);
        bookList.set(0,new Book(3,"PHP",55.55));
        System.out.println(bookList);
        System.out.println(bookList.get(1));
        bookList.add(new Book(6,"HTML",55.55));
        System.out.println(bookList);
        System.out.println(bookList.indexOf(3));
        System.out.println(bookList.lastIndexOf("C语言"));


    }
}
