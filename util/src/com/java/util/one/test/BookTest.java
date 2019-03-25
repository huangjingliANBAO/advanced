package com.java.util.one.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"语文书",88.88));
        bookList.add(new Book(2,"高数",55.55));
        bookList.add(new Book(3,"英语",66.66));
        System.out.println("--------图书信息------------");
        System.out.println("id     书名      价格");
        int length = bookList.size();
        for (int i = 0;i < length; i++){
            System.out.println(bookList.get(i).getId()+"    "+bookList.get(i).getName()+"     "+bookList.get(i).getPirce());

        }
        System.out.println("用Iterator迭代器输出");
        Iterator<Book> iterator = bookList.iterator();
        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.getId()+"   "+book.getName()+ "     "+ book.getPirce());
        }
        System.out.println("Lambda表达式输出");
        bookList.forEach(book -> System.out.println(book.getId()+"   "+book.getName()+ "     "+ book.getPirce()));
    }
}
